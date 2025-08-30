package array;
import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store digits
        int maxDigit = 10;  // maximum digits we’ll store
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0) {
            int digit = number % 10;   // last digit
            digits[index] = digit;     // store in array
            index++;
            number /= 10;              // remove last digit

            if (index == maxDigit) {
                break; // stop if maxDigit reached
            }
        }

        // Variables to store largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: Not available (all digits same or only one digit entered)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}
