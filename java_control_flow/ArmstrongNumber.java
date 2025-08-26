package java_control_flow;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;
        int sum = 0;

        // Step 3: Use a while loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;          // Get last digit
            sum += digit * digit * digit;             // Add cube of digit to sum
            originalNumber = originalNumber / 10;     // Remove last digit
        }

        // Step 4: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        scanner.close();
    }
}
