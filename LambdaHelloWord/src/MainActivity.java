
public class MainActivity {

	public static void main(String[] args) {
		   
	    Printable printer = message -> System.out.println(message);

	    printer.print("Hello, World!");
	}

}
