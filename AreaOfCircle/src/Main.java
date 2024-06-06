

public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle();
        
        // Define the radius
        double radius = 5.0;
        
        // Calculate the area
        double area = circle.calculateArea(radius);
        
        // Print the area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
