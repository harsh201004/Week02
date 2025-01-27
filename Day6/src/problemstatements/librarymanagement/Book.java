package problemstatements.librarymanagement;

public class Book extends LibraryItems implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    //Override
    public int getLoanDuration() {
        return 14;
    }

    //Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved successfully for: " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    //Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
