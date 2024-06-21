
public class MainClassWithCheckNumber {
    public static void main(String[] args) {
        CheckNumber checker = new CheckNumber();
        
        try {
            checker.validate(5);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
