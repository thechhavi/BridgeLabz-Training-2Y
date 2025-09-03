package strings;
import java.util.Scanner;

public class TrimString {

    // Method to find start and end indices (ignoring spaces)
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string with spaces
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Find start and end index
        int[] indices = findTrimIndices(input);

        // Custom trimmed string
        String customTrimmed = "";
        if (indices[0] <= indices[1]) {  // only if valid
            customTrimmed = customSubstring(input, indices[0], indices[1]);
        }

        // Built-in trim method
        String builtInTrimmed = input.trim();

        // Compare
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nOriginal String: \"" + input + "\"");
        System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both equal? " + isSame);

        sc.close();
    }
}
