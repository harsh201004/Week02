public class HotelBooking {
    String Guestname;
    String roomtype;
    int nights;
    //default constructor
    public HotelBooking(){
        this.Guestname="anubhav";
        this.roomtype="deluxe";
        this.nights=2;
        System.out.println("guestname is: "+Guestname+" room type is: "+roomtype+" number of nights: "+nights);
    }
    //parameter constructor
    public HotelBooking(String Guestname, String roomtype, int nights){
        this.Guestname=Guestname;
        this.roomtype=roomtype;
        this.nights=nights;
        System.out.println("guestname is:" +Guestname+ "room type is: "+roomtype+" number of nights: "+nights);
    }
    //copy constructor
    public HotelBooking(HotelBooking h1){
        this.Guestname= h1.Guestname;
        this.roomtype= h1.roomtype;
        this.nights= h1.nights;
        System.out.println("guestname is:" +Guestname+ "room type is: "+roomtype+" number of nights: "+nights);
    }

    //main method
    public static void main(String[] args) {
        HotelBooking h2=new HotelBooking();
        HotelBooking h1=new HotelBooking("devesh","deluxe",4);
        HotelBooking h3=new HotelBooking(h1);
    }
}
