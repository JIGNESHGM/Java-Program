import java.util.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "2003";

        try {
        	Database db = new Database(url, username, password);
            Bank bank = new Bank(db);
            SavingsAccount savingsAccount = new SavingsAccount(db);
            CurrentAccount currentAccount = new CurrentAccount(db);
            FDAccount fdAccount = new FDAccount(db);
            RDAccount rdAccount = new RDAccount(db);
            CarLoanAccount carLoanAccount = new CarLoanAccount(db);
            BikeLoanAccount bikeLoanAccount =	 new BikeLoanAccount(db);
            HomeLoanAccount homeLoanAccount = new HomeLoanAccount(db);
            Customer customerService = new Customer(db);
            KYCVerification kycService = new KYCVerification(db);


            // Sample operations (no logic executed)
            Map<String, Object> customerData = new HashMap<>();
            customerData.put("id", 1);
            customerData.put("name", "John Doe");
            customerService.addCustomer(customerData);

            savingsAccount.deposit(1, 1000);
            bank.openAccount(1, "Savings");

            db.close(); // Don't forget to close the connection
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
