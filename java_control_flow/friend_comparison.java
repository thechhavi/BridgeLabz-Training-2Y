package java_control_flow;
import java.util.Scanner;
public class friend_comparison {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter Amar's age: ");
	        int ageAmar = input.nextInt();
	        System.out.print("Enter Amar's height (in cm): ");
	        int heightAmar = input.nextInt();

	        System.out.print("Enter Akbar's age: ");
	        int ageAkbar = input.nextInt();
	        System.out.print("Enter Akbar's height (in cm): ");
	        int heightAkbar = input.nextInt();

	        System.out.print("Enter Anthony's age: ");
	        int ageAnthony = input.nextInt();
	        System.out.print("Enter Anthony's height (in cm): ");
	        int heightAnthony = input.nextInt();

	        String youngest;
	        int minAge = ageAmar;

	        youngest = "Amar";
	        if (ageAkbar < minAge) {
	            minAge = ageAkbar;
	            youngest = "Akbar";
	        }
	        if (ageAnthony < minAge) {
	            minAge = ageAnthony;
	            youngest = "Anthony";
	        }

	        String tallest;
	        int maxHeight = heightAmar;

	        tallest = "Amar";
	        if (heightAkbar > maxHeight) {
	            maxHeight = heightAkbar;
	            tallest = "Akbar";
	        }
	        if (heightAnthony > maxHeight) {
	            maxHeight = heightAnthony;
	            tallest = "Anthony";
	        }

	        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + minAge + ")");
	        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

	
	    }
}
