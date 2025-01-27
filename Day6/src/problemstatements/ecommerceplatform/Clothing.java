package problemstatements.ecommerceplatform;

public class Clothing extends Product implements Taxable{

    private static final double TAX_RATE = 0.05;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    //Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    //Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    //Override
    public String getTaxDetails() {
        return "Tax rate for Clothing: " + (TAX_RATE * 100) + "%";
    }
}
