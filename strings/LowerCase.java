package strings;
import java.util.Scanner;

public class LowerCase {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String customToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If uppercase, convert to lowercase by adding 32
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert using custom method
        String customLower = customToLowerCase(text);

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Compare the two strings
        boolean areEqual = compareStrings(customLower, builtInLower);

        // Display results
        System.out.println("\nCustom Lowercase   : " + customLower);
        System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Are both equal?    : " + areEqual);

        sc.close();
    }
}

