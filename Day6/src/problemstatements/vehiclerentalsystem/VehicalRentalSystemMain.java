package problemstatements.vehiclerentalsystem;

public class VehicalRentalSystemMain {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", 4000, "CAR12345");
        Vehicle bike = new Bike("B001", 800, "BIKE67890");
        Vehicle truck = new Truck("T001", 10000, "TRUCK112233");

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());

            double rentalCost = vehicle.calculateRentalCost(5); // Rental for 5 days
            System.out.println("Rental Cost for 5 days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(insurable.getInsuranceDetails());
            } else {
                System.out.println("No insurance available for this vehicle type.");
            }
           System.out.println("\n");
        }
    }
}
