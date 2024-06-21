public class OddNumberPrinter extends Thread {
    private int n;

    public OddNumberPrinter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            if (i % 2!= 0) {
                System.out.println(i + " ");
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
        }
    }
}