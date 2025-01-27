package problemstatements.onlinefood;

public class NonVeg extends FoodItems implements Discountable{
    private static final double NON_VEG_EXTRA_CHARGE = 50.0;
    private double discount;

    public NonVeg(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    //Override
    public double calculateTotalPrice() {
        double basePrice = getQuantity() * getPrice() + NON_VEG_EXTRA_CHARGE;
        return basePrice - (basePrice * (discount / 100));
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
