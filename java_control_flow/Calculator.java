package java_control_flow;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get inputs
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        double result;

        // Step 2: Perform operation based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                // Handle division by zero
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}
