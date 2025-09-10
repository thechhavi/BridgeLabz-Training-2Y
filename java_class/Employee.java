package java_class;

class Employee {
    // non-static variables
    String name;
    int id;
    double salary;

    // creating method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // creating object with default constructor
        Employee emp = new Employee();

        // assigning values
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;

        // calling the display method
        emp.displayEmployee();
    }
}
