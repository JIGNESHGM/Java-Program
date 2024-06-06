public class Student {
    // Static variable to keep track of the total number of students
    private static int studentCount = 0;

    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++; 
    }

    // Static method to get the total number of students
    public static int getStudentCount() {
        return studentCount;
    }

    // Instance method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
