public class MainActivity {
    public static void main(String[] args) {
        Color color = new Color();
        try {
            color.setColorName("blue");
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            color.setColorName("red");
            System.out.println(color);
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            color.setColorName("green");
            System.out.println(color);
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            color.setColorName("yellow");
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            color.setColorName("white");
            System.out.println(color);
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
    }
}
