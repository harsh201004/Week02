import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
     String itemName;
     double price;
     int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Get total cost for the item
    public double getTotalCost() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }
}

class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
    }

    // Method to display the total cost
    public double getTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        return total;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        // Adding items to the cart
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = sc.nextInt();

        cart.addItem(itemName, price, quantity);

        // Removing an item from the cart
        sc.nextLine(); // Consume newline
        System.out.print("Enter item name to remove: ");
        String removeItemName = sc.nextLine();
        cart.removeItem(removeItemName);

        // Displaying the total cost
        System.out.println("Total cost: $" + cart.getTotalCost());
    }
}
