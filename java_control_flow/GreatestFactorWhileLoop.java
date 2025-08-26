package java_control_flow;
import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
            scanner.close();
            return;
        }

        // Initialize variables
        int greatestFactor = 1;
        int counter = number - 1;

        // Use while loop to find the greatest factor
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit the loop once the greatest factor is found
            }
            counter--;
        }

        // Output
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
