package array;
import java.util.Scanner;

public class q1 {
    public static void main(String args[]) {
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}
