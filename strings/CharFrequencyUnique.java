package strings;
import java.util.Scanner;

public class CharFrequencyUnique {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if current appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency of characters using unique chars
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII size

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Step 2: Get unique characters
        char[] unique = uniqueCharacters(text);

        // Step 3: Store in 2D array
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Method to display frequency table
    public static void display(String[][] table) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-10s %-10s\n", table[i][0], table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        display(result);
    }
}
