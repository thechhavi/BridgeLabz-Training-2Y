package java_method;
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // adding each natural number
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Calculate sum
        int sum = findSum(n);

        // Display result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
