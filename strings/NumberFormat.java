package strings;
import java.util.Scanner;

public class NumberFormat {

    // Method to generate the Exception
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle the Exception
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
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
