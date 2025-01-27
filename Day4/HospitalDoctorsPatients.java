import java.util.ArrayList;

// Patient Class
class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name + " has consulted the following doctors:");
        for (Doctor doctor : consultedDoctors) {
            System.out.println(" - Dr. " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }
    }
}

// Doctor Class
class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " (" + specialization + ") consulted with Patient: " + patient.getName());
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + " (" + specialization + ") has consulted the following patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

// Hospital Class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(" - Dr. " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }
    }

    public void displayPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

// Main Class
public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        // Create a Hospital
        Hospital hospital = new Hospital("Apolo");

        // Create Doctors
        Doctor doctor1 = new Doctor("A", "x");
        Doctor doctor2 = new Doctor("B", "y");

        // Create Patients
        Patient patient1 = new Patient("C");
        Patient patient2 = new Patient("D");

        // Add Doctors to the Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Add Patients to the Hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations (
        doctor1.consult(patient1); 
        doctor2.consult(patient1); 
        doctor2.consult(patient2); 

        System.out.println();

        // Display Doctors in the Hospital
        hospital.displayDoctors();
        System.out.println();

        // Display Patients in the Hospital
        hospital.displayPatients();
        System.out.println();

        // Display Consultations for Each Doctor
        doctor1.displayPatients();
        System.out.println();
        doctor2.displayPatients();
        System.out.println();

        // Display Consultations for Each Patient
        patient1.displayConsultedDoctors();
        System.out.println();
        patient2.displayConsultedDoctors();
    }
}
