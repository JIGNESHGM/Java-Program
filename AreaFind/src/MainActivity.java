
public class MainActivity {

	public static void main(String[] args) {
		
		Area rectangle = new Area();

        rectangle.setDim(5.0, 3.0);
        
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

	}

}
