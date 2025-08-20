package programming_element;
import java.util.Scanner;
public class distanceconverter {

	public static void main(String[] args) {
	
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the distance in feet: ");
		        double feet = input.nextDouble();

		        double yards = feet / 3;
		        double miles = yards / 1760;

		        double inches = feet * 12;
		        double centimeters = inches * 2.54;

		        System.out.println("\n--- Results ---");
		        System.out.printf("Distance in Yards: %.2f yards\n", yards);
		        System.out.printf("Distance in Miles: %.6f miles\n", miles);
		        System.out.printf("Your Height in cm is %.2f cm while in feet is %.2f ft and inches is %.2f in\n",
		                          centimeters, feet, inches);



	}

}
