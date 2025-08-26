package java_control_flow;
import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Calculate factorial using while loop
        long factorial = 1;  // Use long to handle larger results
        int counter = 1;
        while (counter <= number) {
            factorial *= counter;
            counter++;
        }

        // Output
        System.out.println("Factorial of " + number + " is " + factorial);

        scanner.close();
    }
}
