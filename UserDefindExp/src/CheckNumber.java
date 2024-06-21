// CheckNumber.java
public class CheckNumber {
    public void validate(int number) throws CustomException {
        if (number < 10) {
            throw new CustomException("Number is less than 10!");
        }
    }
}
