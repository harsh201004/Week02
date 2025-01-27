package problemstatements.ridehailing;

public class Bike extends Vehicle implements GPS{
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    //Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    //Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    //Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
