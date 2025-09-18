package java_static;
public class Patient {
 // Static variable shared among all patients
 private static String hospitalName = "City Hospital";
 
 // Static variable to count total patients
 private static int totalPatients = 0;

 // Final variable for unique patient ID
 private final int patientID;
 private String name;
 private int age;
 private String ailment;

 // Constructor
 public Patient(int patientID, String name, int age, String ailment) {
     // 'this' resolves ambiguity
     this.patientID = patientID;
     this.name = name;
     this.age = age;
     this.ailment = ailment;
     totalPatients++; // Increment total patients
 }

 // Static method to get total patients
 public static int getTotalPatients() {
     return totalPatients;
 }

 // Method to display patient details
 public void displayDetails() {
     // instanceof check
     if (this instanceof Patient) {
         System.out.println("Hospital: " + hospitalName);
         System.out.println("Patient ID: " + patientID);
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Ailment: " + ailment);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     Patient p1 = new Patient(101, "Chhavi Varshney", 22, "Fever");
     Patient p2 = new Patient(102, "Shinchan", 23, "Cold");

     p1.displayDetails();
     System.out.println();
     p2.displayDetails();

     System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
 }
}
