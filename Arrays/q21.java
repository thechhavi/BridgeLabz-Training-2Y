package array;
import java.util.Scanner;

public class q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays for employee data
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalaries = new double[10];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop with validation
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("  Enter salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("  Invalid salary. Please enter again.");
                i--; // decrement index to re-enter this employee
                continue;
            }

            System.out.print("  Enter years of service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("  Invalid years of service. Please enter again.");
                i--; // decrement index to re-enter this employee
                continue;
            }

            salaries[i] = salary;
            years[i] = yrs;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salaries[i] * 0.02; // 2% bonus
            }
            newSalaries[i] = salaries[i] + bonus[i];

            // accumulate totals
            totalBonus += bonus[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\n--- Salary & Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonus[i], newSalaries[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}
