public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public void printArea() {
        double area = length * length;
        System.out.println("Area of Square: " + area);
    }

    public void printPerimeter() {
        double perimeter = 4 * length;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
