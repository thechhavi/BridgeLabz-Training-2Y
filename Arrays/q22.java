package array;
import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights
        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + ":");

            System.out.print("  Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("  Enter height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find the youngest
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find the tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is " + names[maxHeightIndex] + " with height " + heights[maxHeightIndex] + " cm");

        sc.close();
    }
}
