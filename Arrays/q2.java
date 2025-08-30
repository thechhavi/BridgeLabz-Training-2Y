package array;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // array of 5 elements

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n--- Results ---");

        // Checking each number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("Number " + arr[i] + " is Positive and Even.");
                } else {
                    System.out.println("Number " + arr[i] + " is Positive and Odd.");
                }
            } else if (arr[i] < 0) {
                System.out.println("Number " + arr[i] + " is Negative.");
            } else {
                System.out.println("Number " + arr[i] + " is Zero.");
            }
        }

        // Compare first and last elements
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\n--- Comparison of First and Last Elements ---");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ").");
        }

        sc.close();
    }
}
