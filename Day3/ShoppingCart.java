class Product {
    // Static variable for discount, shared by all products
    static double discount = 10.0; 

    // Final variable to ensure uniqueness
    final String productID;
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; 
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to calculate the total price after applying the discount
    public double getTotalPrice() {
        return (price * quantity) * (1 - discount / 100);
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after Discount: " + getTotalPrice());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("P001", "Laptop", 1500.0, 2);
        Product product2 = new Product("P002", "Smartphone", 800.0, 3);

        // Display product details before discount update
        System.out.println("Before Discount Update:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Update discount for all products
        Product.updateDiscount(15.0);

        // Display product details after discount update
        System.out.println("\nAfter Discount Update:");
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
