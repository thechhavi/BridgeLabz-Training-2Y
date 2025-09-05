package java_method;
import java.util.Scanner;

public class BMI{

    // Method to calculate BMI and update the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100; // convert cm → m
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[10][3]; // weight, height, BMI

        // Input for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(teamData);

        // Get BMI status
        String[] status = getBMIStatus(teamData);

        // Display results
        System.out.println("\nTeam Members BMI Report:");
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }

        sc.close();
    }
}
