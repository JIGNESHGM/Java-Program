import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageRead;
import org.apache.commons.imaging.ImageWrite;
import org.apache.commons.imaging.common.ImageInformation;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RemoveBackgroundAndUpload {
    public static void main(String[] args) throws Exception {
        // Open the image file
        File file = new File("mytime_image.jpg");
        ImageInformation imageInformation = ImageRead.readImageInformation(file);
        BufferedImage img = ImageRead.readImage(file, imageInformation);

        // Remove the background (assuming it's white)
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                int pixel = img.getRGB(x, y);
                if (pixel == 0xFFFFFFFF) { // White
                    img.setRGB(x, y, 0x00FFFFFF); // Transparent
                }
            }
        }

        // Save the new image with transparent background
        File outputFile = new File("mytime_image_transparent.png");
        ImageWrite.writeImage(img, outputFile, ImageFormat.IMAGE_FORMAT_PNG, new JpegImageMetadata());

        // Upload the image to an image hosting site (e.g. Imgur)
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new MultipartBody.Builder()
               .setType(MultipartBody.FORM)
               .addFormDataPart("image", "mytime_image_transparent.png",
                        RequestBody.create(MediaType.get("image/png"), outputFile))
               .build();
        Request request = new Request.Builder()
               .url("https://api.imgur.com/3/image")
               .header("Authorization", "Client-ID YOUR_IMGUR_API_KEY")
               .post(requestBody)
               .build();
        Response response = client.newCall(request).execute();
        if (response.code() == 200) {
            System.out.println("Image uploaded successfully!");
            System.out.println("Image URL: " + response.body().string());
        } else {
            System.out.println("Error uploading image: " + response.body().string());
        }
    }
}