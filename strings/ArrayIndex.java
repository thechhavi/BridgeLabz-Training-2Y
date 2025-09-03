package strings;
import java.util.Scanner;

public class ArrayIndex {

    // Method to generate the Exception
    public static void generateException(String[] names) {
        // Accessing index larger than the length of the array
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }

    // Method to handle the Exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create and fill array
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Step 1: Call method that generates exception
        System.out.println("\nCalling generateException()...");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        // Step 2: Call method that handles exception
        System.out.println("\nCalling handleException()...");
        handleException(names);

        System.out.println("\nProgram continues after handling exception.");
        sc.close();
    }
}
