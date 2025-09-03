package strings;
import java.util.Scanner;

public class IllegalArgument{

    // Method to generate the Exception
    public static void generateException(String str) {
        // Start index > End index → throws IllegalArgumentException
        System.out.println("Substring (5,2): " + str.substring(5, 2));
    }

    // Method to handle the Exception
    public static void handleException(String str) {
        try {
            // risky code
            System.out.println("Substring (5,2): " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Step 1: Call method that generates exception
        System.out.println("\nCalling generateException()...");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\nCalling handleException()...");
        handleException(text);

        System.out.println("\nProgram continues after handling exception.");
        sc.close();
    }
}
