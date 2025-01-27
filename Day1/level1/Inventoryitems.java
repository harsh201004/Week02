import java.util.Scanner;

public class Inventoryitems {
    String itemCode;
    String itemName;
    int price;
    int quantity;

    public Inventoryitems(String itemCode, String itemName, int price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void itemDetails() {
        System.out.println("Item code: " + itemCode);
        System.out.println("Item name: " + itemName);
        System.out.println("Item price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost of the items: " + totalCost());
    }
    public int totalCost() {
        return quantity*price;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item code: ");
        String itemCode = input.nextLine();

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the item price: ");
        int price = input.nextInt();

        System.out.print("Enter the quantity of the item: ");
        int quantity = input.nextInt();

        Inventoryitems items = new Inventoryitems(itemCode, itemName, price, quantity);
       items.itemDetails();
        input.close();
    }
}
