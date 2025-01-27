package problemstatements.librarymanagement;

abstract class LibraryItems {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItems(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
