package java_method;
import java.util.*;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int size) {
        int[][] data = new int[size][2]; // [salary, yearsOfService]
        for (int i = 0; i < size; i++) {
            int salary = (int) (Math.random() * 90000) + 10000; // 5-digit salary
            int years = (int) (Math.random() * 10) + 1;         // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][3]; // [oldSalary, newSalary, bonus]
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display in tabular format
    public static void displayResults(int[][] data, double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee | Years | Old Salary | Bonus    | New Salary");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int years = data[i][1];
            double oldSalary = results[i][0];
            double newSalary = results[i][1];
            double bonus = results[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%8d | %5d | %10.2f | %8.2f | %10.2f\n",
                    (i + 1), years, oldSalary, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------");
        System.out.printf("Total    |       | %10.2f | %8.2f | %10.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] salaryData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, salaryData);
    }
}
