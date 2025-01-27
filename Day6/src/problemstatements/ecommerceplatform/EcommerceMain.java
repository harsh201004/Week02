package problemstatements.ecommerceplatform;

public class EcommerceMain {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(101, "Laptop", 50000),
                new Clothing(102, "T-Shirt", 1500),
                new Groceries(103, "Rice Bag", 1200)
        };

        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = price - discount + tax;

            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------");
        }
    }
}
