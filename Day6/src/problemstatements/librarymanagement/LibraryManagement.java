package problemstatements.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create instances of different items
        LibraryItems book = new Book("A111", "A", "X");
        LibraryItems magazine = new Magazine("B222", "B", "Y");
        LibraryItems dvd = new Dvd("C333", "C", "Z");

        // Polymorphism in action
        LibraryItems[] items = {book, magazine, dvd};

        for (LibraryItems item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
                reservable.reserveItem("Rohit");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println();
        }
    }
}
