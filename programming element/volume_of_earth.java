package programming_element;
public class volume_of_earth {

    public static void main(String[] args) {
    	
        double pi = 3.141592653589793;

        double radiusKm = 6378;

        double volumeKm3 = (4.0 / 3.0) * pi * (radiusKm * radiusKm * radiusKm);

        double milesPerKm = 0.621371;
        double conversionFactor = milesPerKm * milesPerKm * milesPerKm;
        double volumeMi3 = volumeKm3 * conversionFactor;

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMi3);
    }
}

