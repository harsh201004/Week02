public class Product {
    // Instance variables
     String productName;
     double price;

    // Class variable (shared among all products)
   public static int totalProducts = 0;

    // Constructor to initialize the product
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 800.99);
        Product product3 = new Product("Headphones", 150.75);

        // Displaying individual product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Displaying total products created
        Product.displayTotalProducts();  // Using class method to display total count
    }
}

