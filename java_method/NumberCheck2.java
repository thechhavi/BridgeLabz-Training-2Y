package java_method;
import java.util.*;

public class NumberCheck2{

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits into an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of digits in number
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // 0–9 digits
        for (int d : digits) {
            freq[d]++;
        }

        // Build 2D array for digit-frequency pairs
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] freqArray = new int[count][2];
        int index = 0;
        for (int d = 0; d < 10; d++) {
            if (freq[d] > 0) {
                freqArray[index][0] = d;
                freqArray[index][1] = freq[d];
                index++;
            }
        }

        return freqArray;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumSq);

        System.out.println("Is Harshad Number? " + isHarshad(number, digits));

        int[][] freqArray = digitFrequency(digits);
        System.out.println("Digit Frequencies (Digit -> Count):");
        for (int[] row : freqArray) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        sc.close();
    }
}
