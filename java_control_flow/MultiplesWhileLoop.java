package java_control_flow;
import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
            scanner.close();
            return;
        }

        // Print multiples using while loop
        System.out.println("Multiples of " + number + " below 100 are:");
        int multiple = number;

        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }

        scanner.close();
    }
}
