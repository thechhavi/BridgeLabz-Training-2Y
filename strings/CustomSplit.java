package strings;
import java.util.Scanner;

public class CustomSplit {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop when out of bounds
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {
        int length = findLength(text);

        // Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; // before first word

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // end of last word

        // Extract words
        String[] words = new String[wordCount];
        for (int w = 0; w < wordCount; w++) {
            String word = "";
            for (int i = spaceIndexes[w] + 1; i < spaceIndexes[w + 1]; i++) {
                word += text.charAt(i);
            }
            words[w] = word;
        }

        return words;
    }

    // Compare two string arrays manually
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!compareStrings(arr1[i], arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        int len1 = findLength(s1);
        int len2 = findLength(s2);

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Custom split
        String[] customWords = splitText(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare
        boolean isSame = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (isSame ? "Both match ✅" : "They differ ❌"));

        sc.close();
    }
}
