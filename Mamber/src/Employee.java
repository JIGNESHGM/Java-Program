class Employee extends Member {
    private double salary;
    String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address);
        this.salary = salary;
        this.specialization = specialization;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}