package problemstatements.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord{
    private double dailyCharge;
    private int daysAdmitted;
    private String[] medicalRecords;
    private int recordCount;

    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new String[5]; // Fixed-size array for records
        this.recordCount = 0;
    }
    //Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted; // Billing logic for in-patients
    }
    //Override
    public void addRecord(String record) {
        if (recordCount < medicalRecords.length) {
            medicalRecords[recordCount++] = record;
        } else {
            System.out.println("Medical record limit reached for InPatient: " + getName());
        }
    }
    //Override
    public String[] viewRecords() {
        return medicalRecords;
    }
}
