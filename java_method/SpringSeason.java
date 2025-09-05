package java_method;
public class SpringSeason {

    // Method to check if given date falls in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring starts March 20 and ends June 20
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||    // April
            (month == 5 && day >= 1 && day <= 31) ||    // May
            (month == 6 && day >= 1 && day <= 20)) {    // June 1–20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Taking input from command line arguments
        if (args.length != 2) {
            System.out.println("Please enter month and day as arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and print result
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
