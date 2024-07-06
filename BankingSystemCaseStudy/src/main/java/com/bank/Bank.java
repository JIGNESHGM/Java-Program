public class Bank implements IBankingService {
    private Database database;

    public Bank(Database database) {
        this.database = database;
    }

    @Override
    public void openAccount(int customerId, String accountType) {
        // Logic to open account
    }

    @Override
    public void closeAccount(int accountId) {
        // Logic to close account
    }

    @Override
    public Map<String, Object> getAccountDetails(int accountId) {
        // Logic to get account details
        return null;
    }
}
