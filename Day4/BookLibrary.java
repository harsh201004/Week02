import java.util.ArrayList;
import java.util.List;

class Book {
     String title;
     String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

class Library {
     String name;
     List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        
        Book book1 = new Book("Making India Awesome", "Chetan Bhagat ");
        Book book2 = new Book("A Bunch of Old Letter ", "Jawaharlal Nehru");
        Book book3 = new Book("Confessions of a Lover ", "Mulk Raj Anand");

        // Creating Libraries
        Library library1 = new Library("Open Library");
        Library library2 = new Library("Only Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Displaying library contents
        System.out.println("Books in " + library1.getName() + ":");
        for (Book book : library1.getBooks()) {
            System.out.println(book);
        }

        System.out.println("\nBooks in " + library2.getName() + ":");
        for (Book book : library2.getBooks()) {
            System.out.println(book);
        }

        // Demonstrating that books can exist independently of libraries
        System.out.println("\nIndependent Book:");
        System.out.println(book1);
    }
}
