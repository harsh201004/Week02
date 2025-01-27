package problemstatements.librarymanagement;

public class Dvd extends LibraryItems implements Reservable{
    private boolean isReserved;

    public Dvd(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    //Override
    public int getLoanDuration() {
        return 3;
    }

    //Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully for: " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    //Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
