package java_control_flow;
import java.util.Scanner;

public class NaturalNumberOrNot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if n is a natural number
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number");
            scanner.close();
            return;
        }

        // Sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Display results
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare results
        if (sumFor == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy between the computations.");
        }

        scanner.close();
    }
}
