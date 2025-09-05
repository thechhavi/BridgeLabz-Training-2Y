package java_method;
import java.util.Scanner;

public class HandShake {
    
    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is: " + handshakes);

        sc.close();
    }
}
