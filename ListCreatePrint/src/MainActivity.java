import java.util.ArrayList;
import java.util.List;

public class MainActivity {
	public static void main(String x[]) {
		List<Object> l1 = new ArrayList<>(34);
        l1.add(12);
        l1.add("Hello");
        l1.add(23.45);
        l1.add(6789809);
        l1.add("bye");
        
        System.out.println("Original List: " + l1);

        // Add new elements through code
        l1.add("New Element 1");
        l1.add(456);
        l1.add("New Element 2");
        l1.add(789.99);

        System.out.println("List after adding new elements: " + l1);

        // Print all elements using Java lambda expression
        l1.forEach(element -> System.out.println(element));
	}
}
