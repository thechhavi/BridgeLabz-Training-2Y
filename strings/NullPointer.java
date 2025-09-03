package strings;
public class NullPointer {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;  // initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles NullPointerException
    public static void handleException() {
        String text = null;  // initialized to null
        try {
            // risky code
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // Step 1: Call method that generates exception
        System.out.println("Calling generateException()...");
        try {
            generateException(); // will throw exception and stop program if not caught
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        // Step 2: Call method that handles exception safely
        System.out.println("\nCalling handleException()...");
        handleException();

        System.out.println("\nProgram continues after handling exception.");
    }
}
