
public class MainActivity {

	public static void main(String[] args) {
		int n = 10;
        OddNumberPrinter oddPrinter = new OddNumberPrinter(n);
        EvenNumberPrinter evenPrinter = new EvenNumberPrinter(n);
        oddPrinter.start();
        try {
			oddPrinter.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        evenPrinter.start();
	}

}
