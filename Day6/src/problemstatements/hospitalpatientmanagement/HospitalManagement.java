package problemstatements.hospitalpatientmanagement;

public class HospitalManagement {
    public static void main(String[] args) {
        // Create instances of patients
        Patient inPatient = new InPatient("A111", "A", 40, 1500.0, 5);
        Patient outPatient = new OutPatient("B222", "B", 45, 700.0);

        // Manage medical records for in-patient
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
            inPatientRecord.addRecord("Diagnosed with appendicitis");
            inPatientRecord.addRecord("Surgery performed on 20-Jan-2025");
        }

        // Manage medical records for out-patient
        if (outPatient instanceof MedicalRecord) {
            MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
            outPatientRecord.addRecord("General checkup on 15-Jan-2025");
            outPatientRecord.addRecord("Prescribed medication for hypertension");
        }

        // Polymorphism to process patient details and billing
        Patient[] patients = {inPatient, outPatient};
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            // View medical records if applicable
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records:");
                for (String rec : record.viewRecords()) {
                    if (rec != null) {
                        System.out.println("- " + rec);
                    }
                }
            }
            System.out.println();
        }
    }
}
