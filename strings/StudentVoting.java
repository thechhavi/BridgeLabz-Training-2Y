package strings;
import java.util.Random;
import java.util.Scanner;

public class StudentVoting{

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Random 2-digit number (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "False (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }

        return result;
    }

    // Method to display results in tabular format
    public static void displayResult(String[][] arr) {
        System.out.println("Student\tAge\tCan Vote?");
        System.out.println("-----------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t" + arr[i][0] + "\t" + arr[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);

        sc.close();
    }
}
