package java_static;
public class product {
 // Static variable shared by all products
 private static double discount = 10.0; // 10% default discount

 private int productID = 0;
 private String productName;
 private double price;
 private int quantity;

 // Constructor
 public product(int productID, String productName, double price, int quantity) {
     // 'this' resolves ambiguity
     this.productID = productID;
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // Static method to update discount
 public static void updateDiscount(double newDiscount) {
     discount = newDiscount;
     System.out.println("Discount updated to " + discount + "%");
 }

 // Method to calculate total price after discount
 public double calculateTotalPrice() {
     return price * quantity * (1 - discount / 100);
 }

 // Method to display product details
 public void displayDetails() {
     // instanceof check
     if (this instanceof product) {
         System.out.println("Product ID: " + productID);
         System.out.println("Product Name: " + productName);
         System.out.println("Price: " + price);
         System.out.println("Quantity: " + quantity);
         System.out.println("Total Price after " + discount + "% discount: " + calculateTotalPrice());
     }
 }

 // Main method to test
 public static void main(String[] args) {
     product prod1 = new product(101, "Laptop", 50000, 2);
     product prod2 = new product(102, "Headphones", 2000, 3);

     prod1.displayDetails();
     System.out.println();
     prod2.displayDetails();

     System.out.println();
     product.updateDiscount(15); // Update discount to 15%
     prod1.displayDetails();
 }
}
