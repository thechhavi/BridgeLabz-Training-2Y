package java_control_flow;
import java.util.Scanner;

public class RocketLaunchUsingforLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to start the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Launch message
        System.out.println("Liftoff!");

        scanner.close();
    }
}
