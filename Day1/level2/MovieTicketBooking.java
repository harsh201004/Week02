import java.util.Scanner;
class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // Method to book a ticket
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for ticket booking
        System.out.print("Enter the movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        // Creating a MovieTicket object and booking a ticket
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movieName, seatNumber, price);

        // Displaying the booked ticket details
        System.out.println("\n--- Ticket Details ---");
        ticket.displayTicketDetails();
    }
}
