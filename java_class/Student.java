package java_class;
class Student {
        String name;
    int rollNumber;
    double marks;

    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 45) {
            return "C";
        } else if (marks >= 33) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Chhavi Varshney";
        s1.rollNumber = 101;
        s1.marks = 92.5;

        Student s2 = new Student();
        s2.name = "Aditi Ruhela";
        s2.rollNumber = 102;
        s2.marks = 67;

        System.out.println("Student Report 1:");
        s1.displayStudentDetails();

        System.out.println("\nStudent Report 2:");
        s2.displayStudentDetails();
    }
}
