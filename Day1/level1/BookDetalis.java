import java.util.Scanner;

public class BookDetalis {
    String title;
    String author;
    int price;

    public BookDetalis(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Details of the book :");
        System.out.println("Title:" + title);
        System.out.println("Name of the author:" + author);
        System.out.println("Price of the book:" + price);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the details of the book ");
        System.out.print("Enter the title of the book: ");
        String title = input.nextLine();

        System.out.print("Enter the name of the author: ");
        String author = input.nextLine();

        System.out.print("Enter the price of the book: ");
        int price = input.nextInt();

        BookDetalis book = new BookDetalis(title, author, price);
        book.displayDetails();
        input.close();
        
    }
}
