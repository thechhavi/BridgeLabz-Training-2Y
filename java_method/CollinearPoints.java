package java_method;
import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slopes: avoid division (cross multiplication to prevent divide by zero issues)
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) &&
               (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample input
        System.out.println("Enter coordinates for 3 points:");
        System.out.print("x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Check collinearity using slope
        boolean slopeCheck = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Formula: " + (slopeCheck ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area of Triangle Formula: " + (areaCheck ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}
