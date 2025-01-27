package problemstatements.ridehailing;

public class Car extends Vehicle implements GPS{
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    //Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Fare calculation for a car
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
