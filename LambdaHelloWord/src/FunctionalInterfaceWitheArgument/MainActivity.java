package FunctionalInterfaceWitheArgument;

public class MainActivity {

	public static void main(String[] args) {
		ArgumentClass AC = (int num) -> num*num;
		System.out.println(AC.getSquare(25));

	}

}
