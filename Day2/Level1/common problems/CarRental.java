public class CarRental {
    String customername;
    String carmodel;
    int rentaldays;
     public  static int initialcost=50;
     //parameterized constructor
    public CarRental(String customername, String carmodel, int rentaldays){
        this.customername=customername;
        this.carmodel=carmodel;
        this.rentaldays=rentaldays;
    }
    //method to find the cost of vehicle
    public void costfinder(){

        int totalcost=initialcost*rentaldays;
        System.out.println("total cost for "+rentaldays+" days is "+ totalcost);
    }
    //main method
    public static void main(String[] args) {
        CarRental cr1=new CarRental("anubhav singh","sedan",7);
        cr1.costfinder();
    }
}
