package strings;
import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of the string without using .length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop ends when index goes out of bound
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int length = getLength(text);
        char[] result = new char[length]; // temp array to hold unique chars
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if current char already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, store it
            if (isUnique) {
                result[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // create final array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = result[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] unique = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}

