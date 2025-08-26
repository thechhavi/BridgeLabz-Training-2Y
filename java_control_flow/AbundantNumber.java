package java_control_flow;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable
        int sum = 0;

        // Step 3: Find and sum all proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Step 4: Compare sum with original number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
