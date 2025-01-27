import java.util.Scanner;

public class Circle {
    double radius;
    //default constructor
    public Circle(){
        this(5);
    }
    //parameterized constructor
    public Circle(double radius){
        this.radius=radius;
        System.out.println("radius given by user is :"+ radius);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner object
        System.out.println("enter the radius of the circle");
        double radius=sc.nextDouble();// taking input
        Circle c1=new Circle();//creating object of class circle
    }
}
