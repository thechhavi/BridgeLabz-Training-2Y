package programming_element;
import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter the first number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = input.nextFloat();


        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division;

     
        if (number2 != 0) {
            division = number1 / number2;
            
            System.out.printf(
                "The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication, division);
        } else {
            System.out.printf(
                "The addition, subtraction, and multiplication value of 2 numbers %.2f and %.2f is %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication);
            System.out.println("Division: Cannot divide by zero.");
        }

    }
}
