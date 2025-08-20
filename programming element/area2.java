package programming_element;
import java.util.Scanner;
public class area2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;

        double areaIn2 = areaCm2 / 6.4516;

        System.out.printf("The area of the triangle is %.2f sq cm and %.2f sq in.\n", areaCm2, areaIn2);
    }
}
