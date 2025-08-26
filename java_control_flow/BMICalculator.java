package java_control_flow;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Get user input for weight (kg) and height (cm)
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

        // b. Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI using formula: BMI = weight / (height * height)
        double bmi = weight / (heightMeters * heightMeters);

        // c. Determine weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and Status
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
