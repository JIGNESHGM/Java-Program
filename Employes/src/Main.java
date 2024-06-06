import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Create a Triangle object
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
	}

}
