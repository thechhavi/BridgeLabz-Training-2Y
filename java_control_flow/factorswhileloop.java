package java_control_flow;
import java.util.Scanner;

public class factorswhileloop {
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

        // Find and print factors using while loop
        System.out.println("Factors of " + number + " are:");
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }

        scanner.close();
    }
}
