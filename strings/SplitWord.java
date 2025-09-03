package strings;
import java.util.Scanner;

public class SplitWord {

    // Method to find length of a string without using length()
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

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

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

    // Method to build 2D array with words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        int wordCount = words.length;
        String[][] result = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // store length as String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split words
        String[] words = splitText(text);

        // Get 2D array with words and lengths
        String[][] wordWithLen = getWordsWithLength(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordWithLen.length; i++) {
            String word = wordWithLen[i][0];
            int len = Integer.parseInt(wordWithLen[i][1]); // convert back to integer
            System.out.println(word + "\t\t" + len);
        }

        sc.close();
    }
}
