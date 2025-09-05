package java_control_flow;
import java.util.Scanner;

public class LineEquation {

    // Method to calculate Euclidean Distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and intercept
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope, intercept;

        if (x2 == x1) { // Vertical line case
            System.out.println("Line is vertical, slope is undefined.");
            return new double[]{Double.POSITIVE_INFINITY, x1}; // x = constant line
        }

        slope = (y2 - y1) / (x2 - x1);
        intercept = y1 - slope * x1;

        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        // Line Equation
        double[] line = lineEquation(x1, y1, x2, y2);

        if (line[0] == Double.POSITIVE_INFINITY) {
            System.out.printf("Equation of the line: x = %.2f\n", line[1]);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", line[0], line[1]);
        }

        sc.close();
    }
}
