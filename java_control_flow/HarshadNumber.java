package java_control_flow;
import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop to find the sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Get the last digit
            sum += digit;                     // Add digit to sum
            originalNumber /= 10;             // Remove the last digit
        }

        // Step 4: Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
