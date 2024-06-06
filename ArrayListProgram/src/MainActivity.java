import java.util.HashMap;
import java.util.Scanner;

public class MainActivity {
    static HashMap<String, Person> database = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    DirectoryOperations.createEntry(scanner);
                    break;
                case 2:
                    DirectoryOperations.editEntry(scanner);
                    break;
                case 3:
                    DirectoryOperations.searchByKeyword(scanner);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
