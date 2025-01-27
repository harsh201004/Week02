public class Vehicle {
    // Instance variables
     String ownerName;
     String vehicleType;

    // Class variable (fixed for all vehicles)
    private static double registrationFee = 150.00; // Default registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Alice Johnson", "Truck");

        // Displaying vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Updating the registration fee
        System.out.println("\nUpdating the Registration Fee...\n");
        Vehicle.updateRegistrationFee(200.00);

        // Displaying vehicle details after updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
