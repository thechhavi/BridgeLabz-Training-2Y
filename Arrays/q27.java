package array;
import java.util.Scanner;

public class q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input loop (with validation for positive values)
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("  Enter weight in kg (positive): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("  Invalid weight. Please enter again.");
                }
            } while (weight <= 0);

            double height;
            do {
                System.out.print("  Enter height in meters (positive): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("  Invalid height. Please enter again.");
                }
            } while (height <= 0);

            // Store weight & height
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display report
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
