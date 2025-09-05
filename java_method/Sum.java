package java_method;
import java.util.Scanner;

public class Sum {

    // Recursive method to calculate sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Formula method to calculate sum of n natural numbers
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        // Check if it's a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Calculate using recursion
            int sumRec = recursiveSum(n);

            // Calculate using formula
            int sumFormula = formulaSum(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRec);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);

            // Compare results
            if (sumRec == sumFormula) {
                System.out.println("✅ Both computations match! The result is correct.");
            } else {
                System.out.println("❌ Results do not match. Please check the implementation.");
            }
        }

        sc.close();
    }
}
