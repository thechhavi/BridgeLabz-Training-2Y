package strings;
import java.util.Scanner;

public class Index {

    // Method to generate the Exception
    public static void generateException(String str) {
        // Access index beyond string length
        System.out.println("Character at index 100: " + str.charAt(100));
    }

    // Method to handle the Exception
    public static void handleException(String str) {
        try {
            // risky code
            System.out.println("Character at index 100: " + str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

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
