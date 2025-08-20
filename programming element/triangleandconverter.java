package programming_element;
import java.util.Scanner;
public class triangleandconverter {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		      
		        System.out.print("Enter the base of the triangle (in inches): ");
		        double base = input.nextDouble();

		        System.out.print("Enter the height of the triangle (in inches): ");
		        double height = input.nextDouble();

		        
		        double areaInInches = 0.5 * base * height;

	
		        double areaInCm = areaInInches * 6.4516;

		       
		        double heightInCm = height * 2.54;
		        int feet = (int)(height / 12);           
		        double remainingInches = height % 12;     

		        System.out.println("\n--- Results ---");
		        System.out.printf("Area of triangle: %.2f square inches\n", areaInInches);
		        System.out.printf("Area of triangle: %.2f square centimeters\n", areaInCm);
		        System.out.printf("Your Height in cm is %.2f cm, in feet is %d ft and inches is %.2f in\n",
		                          heightInCm, feet, remainingInches);

		
	}
}
