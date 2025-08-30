package array;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();

        // Validate input
        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
        } else {
            int[] multiplicationResult = new int[10]; // store results for 1 to 10

            // Calculate table
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;
            }

            // Display results
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
            }
        }

        sc.close();
    }
}
