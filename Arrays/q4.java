package array;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // array of size 10
        double total = 0.0;                // to store the sum
        int index = 0;                     // current index

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Stop if user enters 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full (max 10 numbers).");
                break;
            }

            // Store number and increment index
            numbers[index] = num;
            index++;
        }

        // Display stored numbers and calculate total
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}
