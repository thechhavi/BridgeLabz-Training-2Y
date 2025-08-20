package chhavi;
import java.util.*;

public class area{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

      
        double area = Math.PI * Math.pow(radius, 2);

        
        System.out.println("Area of the circle is: " + area);
	}
}
