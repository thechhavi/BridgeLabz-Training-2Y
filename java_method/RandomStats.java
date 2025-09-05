package java_method;
import java.util.Arrays;

public class RandomStats {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // 1000–9999
        }
        return numbers;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    // Main method
    public static void main(String[] args) {
        // Generate 5 random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, max
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
