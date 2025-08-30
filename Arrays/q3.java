package array;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Define array to store results (1 to 10 => size 10)
        int[] table = new int[10];

        // Fill array with multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
