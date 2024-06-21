
public class MainActivity {
    public static void main(String[] args) {
        HiThread hiThread = new HiThread();
        HelloThread helloThread = new HelloThread();

        hiThread.start();
        helloThread.start();

        try {
            
            if (true) { 
                throw new CustomException("This is a user-defined exception!");
            }
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            hiThread.join();
            helloThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
