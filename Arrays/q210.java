package array;
import java.util.Scanner;

public class q210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step b: Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Step c: Count digits
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Step d: Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }

        // Step e: Create frequency array of size 10
        int[] freq = new int[10];

        // Step f: Calculate frequency of each digit
        for (int i = 0; i < length; i++) {
            freq[digits[i]]++;
        }

        // Step g: Display frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
