package array;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11]; // array of size 11
        double sum = 0.0;

        // Get input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; // add to sum
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nThe mean height of the football team is: " + mean);

        sc.close();
    }
}
