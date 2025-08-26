package java_control_flow;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Handle zero separately since it has 1 digit
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        // Step 3: Initialize count and make number positive if it's negative
        int count = 0;
        number = Math.abs(number); // To handle negative numbers

        // Step 4: Loop to count digits
        while (number != 0) {
            number = number / 10; // Remove the last digit
            count++;              // Increase count by 1
        }

        // Step 5: Display the result
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
