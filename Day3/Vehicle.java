class VehicleDetail {
    
    static double registrationFee = 1500.0;

    // Final for unique registration number
     final String registrationNumber;
     String ownerName;
     String vehicleType;

    // Constructor to initialize vehicle details 
    public VehicleDetail(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display vehicle details
    void displayDetails() {
        if (this instanceof VehicleDetail) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class Vehicle {
    public static void main(String[] args) {

        VehicleDetail vehicle1 = new VehicleDetail("Harsh", "Two Wheeler", "AB123");
        VehicleDetail vehicle2 = new VehicleDetail("Kuldeep", "Four Wheeler", "CD456");

        // Display vehicle details
        vehicle1.displayDetails();
        vehicle2.displayDetails();

        // Update and display the new registration fee
        VehicleDetail.updateRegistrationFee(2000.0);
        System.out.println("Updated Registration Fee: " + VehicleDetail.registrationFee);
    }
}
