package strings;
import java.util.Scanner;

public class vowelcons {

    // Method to check if a character is Vowel, Consonant or Not a Letter
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // A=65 → a=97
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        try {
            int i = 0;
            while (true) {
                char ch = text.charAt(i);
                String type = checkChar(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }

                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string
        }

        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsConsonants(text);

        // Display result
        System.out.println("\nCount of Vowels: " + result[0]);
        System.out.println("Count of Consonants: " + result[1]);

        sc.close();
    }
}
