import college.student.Student;
import college.faculty.Faculty;

public class MainClass {
    public static void main(String[] args) {
        Student s = new Student("Avni Gangwar", 14);
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");

        System.out.println("---- Student Details ----");
        s.displayStudentInfo();

        System.out.println("\n---- Faculty Details ----");
        f.displayFacultyInfo();
    }
}
