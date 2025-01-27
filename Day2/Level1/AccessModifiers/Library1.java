class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize the book details
    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Book2 {

    // Constructor to initialize the eBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display details of the eBook
    public void displayDetails() {
        // Accessing protected 'title' and public 'ISBN' from the parent class
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class Library1 {
    public static void main(String[] args) {
        EBook eBook = new EBook("1234567890", "Java Programming", "James Gosling");

        // Displaying details of the eBook
        eBook.displayDetails();

        // Using getter and setter for author name
        System.out.println("Author: " + eBook.getAuthor());
        eBook.setAuthor("James Gosling");
        System.out.println("Updated Author: " + eBook.getAuthor());
    }
}
