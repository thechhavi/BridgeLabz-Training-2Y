package array;
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Copy the number to count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create a reverse array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Display the reversed number
        System.out.println("\n--- Reversed Number ---");
        for (int d : reversed) {
            System.out.print(d);
        }
        System.out.println();

        sc.close();
    }
}
