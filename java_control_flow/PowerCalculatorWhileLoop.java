package java_control_flow;
import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        // Validate inputs
        if (number < 0 || power < 0) {
            System.out.println("Please enter non-negative integers only.");
            scanner.close();
            return;
        }

        // Initialize result and counter
        int result = 1;
        int counter = 0;

        // Compute power using while loop
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Output
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
