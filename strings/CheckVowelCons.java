package strings;
import java.util.Scanner;

public class CheckVowelCons {

    // Method to check character type
    public static String checkCharacterType(char ch) {
        // Convert to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to create 2D Array with character and type
    public static String[][] findVowelsConsonants(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display 2D Array in tabular format
    public static void displayResult(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find vowels and consonants
        String[][] result = findVowelsConsonants(input);

        // Display result
        displayResult(result);

        sc.close();
    }
}
