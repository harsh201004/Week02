package problemstatements.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    //Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Additional flat fee for trucks
    }

    //Override
    public double calculateInsurance() {
        return 1000; // Fixed insurance cost for trucks
    }

    //override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
