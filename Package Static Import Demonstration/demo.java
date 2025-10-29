// File: StaticImportDemo.java

import static java.lang.Math.*;  // static import of all static methods from Math class

public class demo {
    public static void main(String[] args) {
        double a = 25;
        double b = 9;

        // Demonstrating static methods without writing Math.
        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println("Power (" + a + "^2) = " + pow(a, 2));
        System.out.println("Maximum of " + a + " and " + b + " = " + max(a, b));
        System.out.println("Minimum of " + a + " and " + b + " = " + min(a, b));
        System.out.println("Absolute value of -15 = " + abs(-15));
    }
}
