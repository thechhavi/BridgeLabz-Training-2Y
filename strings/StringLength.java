package strings;
import java.util.Scanner;

public class StringLength {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // try to access each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using custom method
        int customLength = findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nCustom Length   : " + customLength);
        System.out.println("Built-in Length : " + builtInLength);

        sc.close();
    }
}
