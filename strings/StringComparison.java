package strings;
import java.util.Scanner;

public class StringComparison {
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // First check lengths
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // If all characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean customResult = compareStrings(str1, str2);

        // Compare using built-in equals() method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt(): " + customResult);
        System.out.println("Comparison using equals(): " + builtInResult);

        // Verify if results are same
        if (customResult == builtInResult) {
            System.out.println("✅ Both methods give the SAME result.");
        } else {
            System.out.println("❌ Methods give DIFFERENT results.");
        }

        sc.close();
    }
}
