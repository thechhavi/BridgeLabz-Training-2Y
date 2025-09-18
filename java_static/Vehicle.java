package java_static;
public class Vehicle {
 // Static variable shared by all vehicles
 private static double registrationFee = 500.0; // default fee

 // Final variable for unique registration number
 private final String registrationNumber;
 private String ownerName;
 private String vehicleType;

 // Constructor
 public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
     // 'this' resolves ambiguity
     this.registrationNumber = registrationNumber;
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
 }

 // Static method to update registration fee
 public static void updateRegistrationFee(double newFee) {
     registrationFee = newFee;
     System.out.println("Registration fee updated to: " + registrationFee);
 }

 // Method to display vehicle details
 public void displayDetails() {
     // instanceof check
     if (this instanceof Vehicle) {
         System.out.println("Registration Number: " + registrationNumber);
         System.out.println("Owner Name: " + ownerName);
         System.out.println("Vehicle Type: " + vehicleType);
         System.out.println("Registration Fee: " + registrationFee);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     Vehicle vehicle1 = new Vehicle("REG101", "Chhavi Varshney", "Car");
     Vehicle vehicle2 = new Vehicle("REG102", "Shinchan", "Bike");

     vehicle1.displayDetails();
     System.out.println();
     vehicle2.displayDetails();

     System.out.println();
     Vehicle.updateRegistrationFee(600); // Update fee
     vehicle1.displayDetails();
 }
}
