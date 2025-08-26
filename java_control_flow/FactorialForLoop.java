package java_control_flow;
import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number (0 or positive): ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (0 or positive)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Calculate factorial using for loop
        long factorial = 1;  // long to handle bigger factorials
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output
        System.out.println("Factorial of " + number + " is " + factorial);

        scanner.close();
    }
}
