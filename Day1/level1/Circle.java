import java.util.Scanner;
public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius :" + radius);
        System.out.println("Area :" + area());
        System.out.println("circumference :" + circumference());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Details of the circle: ");
        circle.displayDetails();
        input.close();
    }
}
