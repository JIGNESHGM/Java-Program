
public class BankingExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        new Depositor(account);
        new Withdrawer(account);
    }
}
