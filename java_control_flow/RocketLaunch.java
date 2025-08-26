package java_control_flow;
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to start the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Launch message
        System.out.println("Liftoff!");

        scanner.close();
    }
}
