package strings;
import java.util.Scanner;

public class ArrayComparison {

    // Method to return characters from string without using toCharArray()
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] customArr = customToCharArray(text);

        // Built-in method
        char[] builtInArr = text.toCharArray();

        // Compare arrays
        boolean isSame = compareCharArrays(customArr, builtInArr);

        // Display results
        System.out.print("\nCharacters using custom method: ");
        for (char c : customArr) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArr) {
            System.out.print(c + " ");
        }

        System.out.println("\nComparison result: " + isSame);

        sc.close();
    }
}
