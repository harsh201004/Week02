package problemstatements.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private String[] medicalRecords;
    private int recordCount;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new String[5];
        this.recordCount = 0;
    }

    //Override
    public double calculateBill() {
        return consultationFee;
    }

    //Override
    public void addRecord(String record) {
        if (recordCount < medicalRecords.length) {
            medicalRecords[recordCount++] = record;
        } else {
            System.out.println("Medical record limit reached for OutPatient: " + getName());
        }
    }

    //Override
    public String[] viewRecords() {
        return medicalRecords;
    }
}
