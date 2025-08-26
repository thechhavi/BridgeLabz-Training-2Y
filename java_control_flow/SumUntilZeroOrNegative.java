package java_control_flow;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = scanner.nextDouble();

            // Break if input is 0 or negative
            if (userInput <= 0) {
                break;
            }

            total += userInput;
        }

        System.out.println("Total sum is: " + total);

        scanner.close();
    }
}
