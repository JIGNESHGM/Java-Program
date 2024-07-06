public class Account implements IAccountService {
    protected Database database;

    public Account(Database database) {
        this.database = database;
    }

    @Override
    public void deposit(int accountId, double amount) {
        // Logic to deposit amount
    }

    @Override
    public void withdraw(int accountId, double amount) {
        // Logic to withdraw amount
    }

    @Override
    public double getBalance(int accountId) {
        // Logic to get balance
        return 0;
    }
}
