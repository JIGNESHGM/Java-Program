public class CatchExercise {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 5; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
