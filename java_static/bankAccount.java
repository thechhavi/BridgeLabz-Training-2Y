package java_static;

public class bankAccount {
 // Static variable shared across all accounts
 private static String bankName = "State Bank of India";
 
 // Static variable to count total accounts
 private static int totalAccounts = 0;

 // Final variable, cannot be changed once assigned
 private final int accountNumber;
 private String accountHolderName;
 private double balance;

 // Constructor
 public bankAccount(int accountNumber, String accountHolderName, double balance) {
     // 'this' resolves ambiguity between class variables and parameters
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
     totalAccounts++; // Increment total accounts when a new account is created
 }

 // Static method to get total accounts
 public static int getTotalAccounts() {
     return totalAccounts;
 }

 // Method to display account details
 public void displayDetails() {
     // instanceof check
     if (this instanceof bankAccount) {
         System.out.println("Bank Name: " + bankName);
         System.out.println("Account Number: " + accountNumber);
         System.out.println("Account Holder: " + accountHolderName);
         System.out.println("Balance: " + balance);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     bankAccount acc1 = new bankAccount(101, "Chhavi Varshney", 5000);
     bankAccount acc2 = new bankAccount(102, "Shinchan", 10000);

     acc1.displayDetails();
     System.out.println();
     acc2.displayDetails();

     System.out.println("\nTotal Accounts: " + bankAccount.getTotalAccounts());
 }
}
