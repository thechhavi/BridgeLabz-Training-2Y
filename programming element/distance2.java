package programming_element;

import java.util.Scanner;

public class distance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n", distanceInYards, distanceInMiles);
    }
}
