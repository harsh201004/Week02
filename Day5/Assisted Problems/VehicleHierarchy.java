class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed = " + this.maxSpeed + ", Fuel Type = " + this.fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //Override
    void displayInfo() {
        System.out.println("---- Car Info ----");
        super.displayInfo();
        System.out.println("Seat Capacity = " + this.seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //Override
    void displayInfo() {
        System.out.println("---- Truck Info ----");
        super.displayInfo();
        System.out.println("Load Capacity = " + this.loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasDiscBrake;

    Motorcycle(int maxSpeed, String fuelType, boolean hasDiscBrake) {
        super(maxSpeed, fuelType);
        this.hasDiscBrake = hasDiscBrake;
    }

    //Override
    void displayInfo() {
        System.out.println("---- Motorcycle Info ----");
        super.displayInfo();
        System.out.println("Has disc's brake = " + this.hasDiscBrake);
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(150, "Petrol", 7);
        vehicles[1] = new Truck(100, "Diesel", 12);
        vehicles[2] = new Motorcycle(160, "Petrol", true);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println();
        }
    }
}
