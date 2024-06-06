import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(customerName, initialBalance);
        BankService bankService = new BankService(account);

        while (true) {
            // System.out.println("\nPress Enter to show the menu...");
            scanner.nextLine(); 

            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankService.deposit(depositAmount);
                    bankService.displayBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankService.withdraw(withdrawAmount);
                    bankService.displayBalance();
                    break;
                case 3:
                    bankService.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the banking service.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            scanner.nextLine(); 
        }
    }
}
