package java_control_flow;
import java.util.Scanner;

public class factorsfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
            scanner.close();
            return;
        }

        // Find and print factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
