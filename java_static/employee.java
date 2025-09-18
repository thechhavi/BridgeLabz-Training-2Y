package java_static;
public class employee {
 // Static variable shared by all employees
 private static String companyName = "Tech Solutions Pvt Ltd";
 
 // Static variable to count total employees
 private static int totalEmployees = 0;

 // Final variable for employee ID
 private final int id;
 private String name;
 private String designation;

 // Constructor
 public employee(int id, String name, String designation) {
     // 'this' resolves ambiguity between class variables and parameters
     this.id = id;
     this.name = name;
     this.designation = designation;
     totalEmployees++; // Increment total employees
 }

 // Static method to display total employees
 public static void displayTotalEmployees() {
     System.out.println("Total Employees: " + totalEmployees);
 }

 // Method to display employee details
 public void displayDetails() {
     // instanceof check
     if (this instanceof employee) {
         System.out.println("Company Name: " + companyName);
         System.out.println("Employee ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Designation: " + designation);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     employee emp1 = new employee(1, "Chhavi Varshney", "Software Engineer");
     employee emp2 = new employee(2, "Mansi MAheshwari", "Project Manager");

     emp1.displayDetails();
     System.out.println();
     emp2.displayDetails();

     System.out.println();
     employee.displayTotalEmployees();
 }
}
