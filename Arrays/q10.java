package array;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check input validity
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

        // Create String array to store results
        String[] results = new String[number + 1];  // from 0 to number

        // FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print results
        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
