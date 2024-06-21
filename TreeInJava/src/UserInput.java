import java.util.Scanner;

public class UserInput {
    public int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();
        return number;
    }
}
