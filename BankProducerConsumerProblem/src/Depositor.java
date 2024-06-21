

public class Depositor implements Runnable {
    private BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
        Thread t = new Thread(this, "Depositor");
        t.start();
    }

    @Override
    public void run() {
        int amount = 100; // Deposit 100 units of currency each time
        while (true) {
            account.deposit(amount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
