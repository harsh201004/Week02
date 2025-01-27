class Book {
    // Static variables
    static String libraryName = "Central Library";

    // Instance variables
     final String isbn; // Final to ensure uniqueness
     String title;   
     String author;

    // Constructor to initialize book details
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;      
        this.title = title;    // Using 'this' for clarity
        this.author = author;  
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Getter and setter 
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    // Method to display details 
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }
}

class EBook extends Book {

    // Constructor to initialize eBook details
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author); // Calling parent class constructor
    }

    // Overridden method to display eBook details
   
    public void displayDetails() {
        System.out.println("EBook Details:");
        super.displayDetails(); // Call parent class method for consistency
    }
}

// Main class for Library Management System
public class Library {
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();

        // Create instances of books and eBooks
        Book book = new Book("978316148410", "Java", "ABC");
        EBook eBook = new EBook("1234567890", "Java Programming", "xyz");

        // Display book details
        System.out.println("\nBook Details:");
        book.displayDetails();

        // Display eBook details
        System.out.println("\nEBook Details:");
        eBook.displayDetails();

        // Update and display author for the book
        System.out.println("\nUpdating Author...");
        book.setAuthor("ABC (Updated)");
        System.out.println("Updated Book Details:");
        book.displayDetails();
    }
}
