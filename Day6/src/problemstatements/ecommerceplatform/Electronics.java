package problemstatements.ecommerceplatform;

public class Electronics extends Product implements Taxable{

    private static final double TAX_RATE = 0.18;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    //override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    //Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    //Override
    public String getTaxDetails() {
        return "Tax rate for Electronics: " + (TAX_RATE * 100) + "%";
    }
}
