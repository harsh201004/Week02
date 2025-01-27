import java.util.Scanner;
class MobilePhone {
    String brand ;
    String model;
    int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void details() {
        System.out.println("Details of the phone are as follows:");
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("Price of the phone:" + price);
    }
}
    public class PhoneDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the details of the phone");

        System.out.print("Enter the brand: ");
        String brand = input.nextLine();

        System.out.print("Enter the model: ");
        String model = input.nextLine();

        System.out.print("Enter the price: ");
        int price = input.nextInt();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.details();
    }
}
