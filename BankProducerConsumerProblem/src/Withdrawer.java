

public class Withdrawer implements Runnable {
    private BankAccount account;

    public Withdrawer(BankAccount account) {
        this.account = account;
        Thread t = new Thread(this, "Withdrawer");
        t.start();
    }

    @Override
    public void run() {
        int amount = 50; // Withdraw 50 units of currency each time
        while (true) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
