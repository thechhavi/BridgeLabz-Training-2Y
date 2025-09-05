package java_method;
import java.util.Scanner;

public class Factor {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        // First loop: count number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array with size equal to number of factors
        int[] factors = new int[count];

        // Second loop: store factors in array
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find factors
        int[] factors = findFactors(num);

        // Display factors
        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Calculate and display results
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumSquares = sumOfSquares(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        sc.close();
    }
}
