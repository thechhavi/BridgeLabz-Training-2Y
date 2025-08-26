package java_control_flow;
import java.util.Scanner;

public class divisiblebyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility
        String result = (number % 5 == 0) ? "Yes" : "No";

        // Output
        System.out.println("Is the number " + number + " divisible by 5? " + result);

        scanner.close();
    }
}
