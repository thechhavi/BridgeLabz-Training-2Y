package java_control_flow;
import java.util.Scanner;

public class MultiplesBelow{
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

        // Find and print multiples of the number below 100 (looping backward)
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
