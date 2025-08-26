package java_control_flow;
import java.util.Scanner;

public class SumOfNaturalNumbersComparison {
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

        // Sum using while loop
        int sumLoop = 0;
        int counter = 1;
        while (counter <= n) {
            sumLoop += counter;
            counter++;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Display results
        System.out.println("Sum using while loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare results
        if (sumLoop == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy between the computations.");
        }

        scanner.close();
    }
}
