package programming_element;

import java.util.Scanner;

public class handshake_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("The maximum number of handshakes among %d students is %d\n",
                          numberOfStudents, handshakes);

    }
}
