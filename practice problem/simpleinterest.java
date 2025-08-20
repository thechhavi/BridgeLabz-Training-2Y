package chhavi;
import java.util.*;

public class simpleinterest {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of interest (in %): ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time (in years): ");
                double time = input.nextDouble();

                double simpleinterest = (principal * rate * time) / 100;

                System.out.println(simpleinterest);

         
            }
        }
