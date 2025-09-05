package java_method;
import java.util.Scanner;

public class Calendar {

    // Array of month names
    private static final String[] MONTHS = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array of days in months (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }

    // Method to get first day of month using Zeller’s Congruence (0=Sat, 1=Sun,...6=Fri)
    public static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = 1; // Day of month
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + (5 * j)) % 7;
        // Convert Zeller result: 0=Saturday → shift to 0=Sunday
        return (h + 6) % 7;
    }

    // Method to display calendar
    public static void printCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(month, year);

        System.out.println("\n   " + MONTHS[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}
