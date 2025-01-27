package problemstatements.librarymanagement;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
