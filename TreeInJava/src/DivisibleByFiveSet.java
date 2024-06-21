import java.util.TreeSet;

public class DivisibleByFiveSet {
    public TreeSet<Integer> createDivisibleByFiveSet() {
        TreeSet<Integer> numbers = new TreeSet<>();
        
        // Adding 5 numbers divisible by 5
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        return numbers;
    }
}
