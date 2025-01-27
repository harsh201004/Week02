class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device id " + deviceId);
        System.out.println("Status " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting " + temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Device device = new Device("D1", "Active");
        Thermostat thermostat = new Thermostat("T1", "Active", 22);

        device.displayStatus();
        thermostat.displayStatus();
    }
}
