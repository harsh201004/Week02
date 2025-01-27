package problemstatements.ridehailing;

public class RideHailingSystem {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("C111", "A", 10.0);
        Vehicle bike = new Bike("B222", "B", 5.0);
        Vehicle auto = new Auto("A333", "C", 8.0);

        // Update locations
        if (car instanceof GPS) ((GPS) car).updateLocation("X");
        if (bike instanceof GPS) ((GPS) bike).updateLocation("Y");
        if (auto instanceof GPS) ((GPS) auto).updateLocation("Z");


        Vehicle[] vehicles = {car, bike, auto};
        double distance = 15.0;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }
}
