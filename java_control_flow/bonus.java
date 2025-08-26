package java_control_flow;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service less than or equal to 5.");
        }

    }
}

