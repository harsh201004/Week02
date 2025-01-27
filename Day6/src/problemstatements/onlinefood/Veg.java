package problemstatements.onlinefood;

public class Veg extends FoodItems implements Discountable{
    private double discount;

    public Veg(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    //Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() - (getQuantity() * getPrice() * (discount / 100));
    }

    //Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    //Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}
