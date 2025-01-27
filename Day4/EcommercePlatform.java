import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Order Class
class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
        System.out.println("Total Amount: $" + calculateTotalAmount());
    }

    private double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            System.out.println(" - Order ID: " + order.getOrderId());
        }
    }
}

// Main Class
public class EcommercePlatform {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Laptop", 600.00);
        Product product2 = new Product("Smartphone", 200.00);
        Product product3 = new Product("Headphones", 50.00);

        // Create Customer
        Customer customer1 = new Customer("Rohit");

        // Create Orders and add Products to them
        Order order1 = new Order("O1", customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("02", customer1);
        order2.addProduct(product3);

        // Customer places Orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Display Customer Orders
        customer1.displayCustomerOrders();
        System.out.println();

        // Display Order Details for each Order placed
        order1.displayOrderDetails();
        System.out.println();
        order2.displayOrderDetails();
    }
}
