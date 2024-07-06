public interface IBankingService {
    void openAccount(int customerId, String accountType);
    void closeAccount(int accountId);
    Map<String, Object> getAccountDetails(int accountId);
}
