public class Color {
    private String colorName;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) throws InvalidColorException {
        if (!colorName.equalsIgnoreCase("red") && 
            !colorName.equalsIgnoreCase("green") && 
            !colorName.equalsIgnoreCase("white")) {
            throw new InvalidColorException("Invalid color name: " + colorName + ". Only 'red', 'green', or 'white' are allowed.");
        }
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color: " + colorName;
    }
}
