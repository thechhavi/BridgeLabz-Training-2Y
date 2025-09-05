package java_method;
import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        // Gregorian calendar starts from 1582
        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
            return false;
        }

        // Condition for leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check and display result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
