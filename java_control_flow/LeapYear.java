package java_control_flow;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Invalid input. Year must be greater than or equal to 1582.");
        } else {
            System.out.println("The year is not a Leap Year.");
        }

        scanner.close();
    }
}
