package java_control_flow;
import java.util.Scanner;

public class PowerCalculator {
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

        // Calculate power using for loop
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Output
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
