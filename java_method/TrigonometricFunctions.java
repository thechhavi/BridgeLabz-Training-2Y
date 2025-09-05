package java_method;
public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometricFunctions calc = new TrigonometricFunctions();

        double angle = 45;  // Example angle
        double[] results = calc.calculateTrigonometricFunctions(angle);

        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
