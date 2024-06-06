public class BankService {
    private BankAccount account;

    public BankService(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void displayBalance() {
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Total Balance: $" + account.getBalance());
    }
}
