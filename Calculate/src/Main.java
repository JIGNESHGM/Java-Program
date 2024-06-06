public class Main {
    public static void main(String[] args) {
        // Test the calculator
        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + SimpleCalculator.add(num1, num2));
        System.out.println("Subtraction: " + SimpleCalculator.subtract(num1, num2));
        System.out.println("Multiplication: " + SimpleCalculator.multiply(num1, num2));
        System.out.println("Division: " + SimpleCalculator.divide(num1, num2));
    }
}
