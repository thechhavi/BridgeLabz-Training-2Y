package java_control_flow;
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
            scanner.close();
            return;
        }

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // First divisible number from the top is the greatest factor
            }
        }

        // Output the result
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
