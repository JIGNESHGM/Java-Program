
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating student objects
        Student student1 = new Student("Jignesh", 21);
        Student student2 = new Student("Vivek", 22);
        Student student3 = new Student("Vandan", 23);

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Using the static method to get the total number of students
        System.out.println("Total number of students: " + Student.getStudentCount());
	}

}
