package strings;
import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Step 1: Count frequency with nested loops
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // already counted
            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Step 2: Count unique characters (not marked '0')
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        // Step 3: Store results in a 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Method to display result
    public static void display(String[] result) {
        System.out.println("Character  Frequency");
        System.out.println("---------------------");
        for (String s : result) {
            System.out.println(s);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] result = findFrequency(input);
        display(result);
    }
}
