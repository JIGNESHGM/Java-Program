// MainClass.java
public class MainActivity {
    public static void main(String[] args) {
        try {
            checkNumber(5);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws CustomException {
        if (number < 10) {
            throw new CustomException("Number is less than 10!");
        } else {
            System.out.println("Number is acceptable.");
        }
    }
}
