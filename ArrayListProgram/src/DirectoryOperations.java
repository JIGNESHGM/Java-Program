import java.util.Scanner;

public class DirectoryOperations {

    public static void createEntry(Scanner scanner) {
        System.out.print("Enter Unique ID: ");
        String uniqueID = scanner.nextLine();
        if (MainActivity.database.containsKey(uniqueID)) {
            System.out.println("This Unique ID already exists. Please try again.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone Number (if available with STD code): ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("Enter Mobile Number (if available): ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter Head of Family: ");
        String headOfFamily = scanner.nextLine();

        Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        MainActivity.database.put(uniqueID, person);
        System.out.println("Entry added successfully!");
    }

    public static void editEntry(Scanner scanner) {
        System.out.print("Enter Unique ID of the entry to edit: ");
        String uniqueID = scanner.nextLine();
        if (!MainActivity.database.containsKey(uniqueID)) {
            System.out.println("Entry not found. Please try again.");
            return;
        }

        Person person = MainActivity.database.get(uniqueID);
        System.out.println("Editing entry: \n" + person);

        System.out.print("Enter new Name (or press Enter to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) person.name = name;

        System.out.print("Enter new Address (or press Enter to keep current): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) person.address = address;

        System.out.print("Enter new Telephone Number (or press Enter to keep current): ");
        String telephoneNumber = scanner.nextLine();
        if (!telephoneNumber.isEmpty()) person.telephoneNumber = telephoneNumber;

        System.out.print("Enter new Mobile Number (or press Enter to keep current): ");
        String mobileNumber = scanner.nextLine();
        if (!mobileNumber.isEmpty()) person.mobileNumber = mobileNumber;

        System.out.print("Enter new Head of Family (or press Enter to keep current): ");
        String headOfFamily = scanner.nextLine();
        if (!headOfFamily.isEmpty()) person.headOfFamily = headOfFamily;

        System.out.println("Entry updated successfully!");
    }

    public static void searchByKeyword(Scanner scanner) {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Person person : MainActivity.database.values()) {
            if (person.name.toLowerCase().contains(keyword) || person.address.toLowerCase().contains(keyword) ||
                person.telephoneNumber.toLowerCase().contains(keyword) || person.mobileNumber.toLowerCase().contains(keyword) ||
                person.headOfFamily.toLowerCase().contains(keyword) || person.uniqueID.toLowerCase().contains(keyword)) {
                System.out.println(person);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No entries found matching the keyword.");
        }
    }
}
