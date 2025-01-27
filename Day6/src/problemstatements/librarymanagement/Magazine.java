package problemstatements.librarymanagement;

public class Magazine extends LibraryItems implements Reservable {
    private boolean isReserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    //Override
    public int getLoanDuration() {
        return 7; // Magazines have a loan duration of 7 days
    }

    //Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine reserved successfully for: " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    //Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
