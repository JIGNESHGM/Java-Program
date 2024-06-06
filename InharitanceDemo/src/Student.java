public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }

    public boolean isGraduated() {
        return getAge() >= 22; // Assuming graduation age is 22
    }

	private int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
