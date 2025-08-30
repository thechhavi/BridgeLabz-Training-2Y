package array;
import java.util.Scanner;

public class q28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[][] marks = new int[n][3];   // Physics, Chemistry, Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print("  " + subject + ": ");
                int mark = sc.nextInt();

                // Validate positive marks
                if (mark < 0) {
                    System.out.println("  Invalid marks. Please enter again.");
                    j--; // decrement subject index
                    continue;
                }
                marks[i][j] = mark;
            }
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // e. Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-6s%n",
                "Physics", "Chemistry", "Maths", "Total Marks", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-12d %-12.2f %-6c%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    total, percentage[i], grade[i]);
        }

        sc.close();
    }
}
