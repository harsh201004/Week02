package problemstatements.onlinefood;

public class OnlineFoodManagement {
    public static void main(String[] args) {
        // Create instances of food items
        FoodItems vegItem = new Veg("Sahi Paneer", 350.0, 2);
        FoodItems nonVegItem = new NonVeg("Chicken Biryani", 100.0, 1);

        // Polymorphism in action
        FoodItems[] order = {vegItem, nonVegItem};

        for (FoodItems item : order) {
            System.out.println(item.getItemDetails());

            // Apply discount if the item is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10.0); // Apply a 10% discount
                System.out.println(discountableItem.getDiscountDetails());
            }

            // Calculate total price
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}
