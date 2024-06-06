
public class MainActivity {

	public static void main(String[] args) {
		
		// Create a Student object
		Student student = new Student("Jignesh", 21, "S12345");
        student.display();
        System.out.println("Is Adult: " + student.isAdult());
        System.out.println("Is Graduated: " + student.isGraduated());

        System.out.println();

        // Create a Teacher object
        Teacher teacher = new Teacher("Rinkal", 22, "Mathematics");
        teacher.display();
        System.out.println("Is Adult: " + teacher.isAdult());
        System.out.println("Is Senior: " + teacher.isSenior());

	}

}
