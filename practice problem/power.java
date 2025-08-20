package chhavi;
import java.util.*;

public class power{
	
public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter base:");
	Double base = input.nextDouble();
	
	System.out.print("Enter exponent: ");
    double exponent = input.nextDouble();
    double result = Math.pow(base, exponent);
    
    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
}
			
}
