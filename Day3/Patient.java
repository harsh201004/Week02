class Patient {
    // Static variable shared across all patients for hospital name
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0; // Tracks the total number of patients

    // Final variable for a unique patient ID
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details using 'this' keyword
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment the total patient count
    }

    // Static method to return the total number of patients
    static int getTotalPatients() {
        return totalPatients;
    }

    // Display patient details, checking if the object is an instance of Patient
    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Patient objects
        Patient patient1 = new Patient("Alice", 30, "Fever", 1);
        Patient patient2 = new Patient("Bob", 45, "Cold", 2);

        // Display patient details and total patients
        patient1.displayDetails();
        patient2.displayDetails();
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
