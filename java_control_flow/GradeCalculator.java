package java_control_flow;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate average
        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        // Determine grade and remarks using logical conditions
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output the results
        System.out.printf("Average Marks: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
