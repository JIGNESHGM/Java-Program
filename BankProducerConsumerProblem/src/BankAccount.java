
public class BankAccount {
    private int balance = 0;
    private boolean transactionComplete = false;

    public synchronized void withdraw(int amount) {
        while (!transactionComplete) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal of: " + amount + ", Balance: " + balance);
        }
        transactionComplete = false;
        notify();
    }

    public synchronized void deposit(int amount) {
        while (transactionComplete) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
        transactionComplete = true;
        notify();
    }
}
