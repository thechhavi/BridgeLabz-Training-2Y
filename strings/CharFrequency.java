package strings;
import java.util.Scanner;

public class CharFrequency {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark counted
            }
        }

        // Reset frequency array for reuse
        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0) freq[i] = -freq[i];
        }

        // Step 3: Store results in 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                visited[c] = true;
                index++;
            }
        }

        return result;
    }

    // Method to display the 2D array
    public static void display(String[][] freqTable) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.printf("%-10s %-10s\n", freqTable[i][0], freqTable[i][1]);
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
