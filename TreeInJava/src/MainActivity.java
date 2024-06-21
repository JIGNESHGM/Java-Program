import java.util.TreeSet;

public class MainActivity {
    public static void main(String[] args) {
        
        DivisibleByFiveSet divisibleByFiveSet = new DivisibleByFiveSet();
        TreeSet<Integer> numbers = divisibleByFiveSet.createDivisibleByFiveSet();

        System.out.println("TreeSet of numbers divisible by 5: " + numbers);

        UserInput userInput = new UserInput();
        int userNumber = userInput.getUserNumber();

        if (numbers.contains(userNumber)) {
            System.out.println(userNumber + " is in the TreeSet.");
        } else {
            System.out.println(userNumber + " is not in the TreeSet.");
        }
    }
}
d