package java_static;
public class book {
 // Static variable shared across all books
 private static String libraryName = "GLA University Library";

 // Final variable, cannot be changed once assigned
 private final String isbn;
 private String title;
 private String author;

 // Constructor
 public book(String title, String author, String isbn) {
     // 'this' resolves ambiguity between class variables and parameters
     this.title = title;
     this.author = author;
     this.isbn = isbn;
 }

 // Static method to display library name
 public static void displayLibraryName() {
     System.out.println("Library Name: " + libraryName);
 }

 // Getter for ISBN
 public String getIsbn() {
     return isbn;
 }

 // Method to display book details
 public void displayDetails() {
     // instanceof check
     if (this instanceof book) {
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("ISBN: " + isbn);
     }
 }

 // Main method to test
 public static void main(String[] args) {
     book book1 = new book("Chemistry Basics", "Chhavi Varshney", "ISBN101");
     book book2 = new book("Advanced Physics", "Shinchan", "ISBN102");

     book.displayLibraryName();
     System.out.println();

     book1.displayDetails();
     System.out.println();
     book2.displayDetails();
 }
}
