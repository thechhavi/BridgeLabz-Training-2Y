package strings;
import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {
        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII frequency array

        // Step 2: Count frequencies for text1
        for (int i = 0; i < text1.length(); i++) {
            char c = text1.charAt(i);
            freq[c]++;
        }

        // Step 3: Subtract frequencies using text2
        for (int i = 0; i < text2.length(); i++) {
            char c = text2.charAt(i);
            freq[c]--;
        }

        // Step 4: Check if all frequencies are zero
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("The texts are Anagrams.");
        } else {
            System.out.println("The texts are NOT Anagrams.");
        }
    }
}
