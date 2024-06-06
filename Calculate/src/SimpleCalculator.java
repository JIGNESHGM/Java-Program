public class SimpleCalculator {

    // Static method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Static method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Static method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Static method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
