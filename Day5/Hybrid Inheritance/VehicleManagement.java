class Vehicle1 {
    int maxSpeed;
    String model;

    Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle inheriting from Vehicle
class ElectricVehicle extends Vehicle1 {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass PetrolVehicle inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle1 implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println(model + " is refueling");
    }
}

// Test the system
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(160, "Toyota");

        ev.charge();
        pv.refuel();
    }
}
