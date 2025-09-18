package java_static;
public class student {
  private static String universityName = "GLA University";
 
 private static int totalStudents = 0;
 private int rollNumber = 0;
 private String name;
 private String grade;
 public student(int rollNumber, String name, String grade) {
     // 'this' resolves ambiguity
     this.rollNumber = rollNumber;
     this.name = name;
     this.grade = grade;
     totalStudents++; // Increment total students
 }

 // Static method to display total students
 public static void displayTotalStudents() {
     System.out.println("Total Students Enrolled: " + totalStudents);
 }

 // Method to display student details
 public void displayStudentDetails() {
     // instanceof check
     if (this instanceof student) {
         System.out.println("University: " + universityName);
         System.out.println("Roll Number: " + rollNumber);
         System.out.println("Name: " + name);
         System.out.println("Grade: " + grade);
     }
 }

 // Method to update grade
 public void updateGrade(String newGrade) {
     if (this instanceof student) {
         this.grade = newGrade;
         System.out.println("Grade updated for Roll Number " + rollNumber);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     student student1 = new student(101, "Chhavi Varshney", "A");
     student student2 = new student(102, "Shinchan", "B");

     student1.displayStudentDetails();
     System.out.println();
     student2.displayStudentDetails();

     System.out.println();
     student.displayTotalStudents();

     System.out.println();
     student2.updateGrade("A+");
     student2.displayStudentDetails();
 }
}
