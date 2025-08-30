package array;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            sc.close();
            return; // exit program
        }

        // Arrays to store odd and even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0, oddIndex = 0;

        // Loop through 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
