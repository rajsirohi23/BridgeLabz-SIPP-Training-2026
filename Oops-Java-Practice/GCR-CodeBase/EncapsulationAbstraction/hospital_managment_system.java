abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public double getTreatmentCharges() {
        return treatmentCharges;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public double getTreatmentCharges() {
        return treatmentCharges;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class Main {
    public static void main(String[] args) {

        InPatient inPatient = new InPatient();
        inPatient.setPatientId(101);
        inPatient.setName("Rahul");
        inPatient.setAge(25);
        inPatient.setRoomCharges(5000);
        inPatient.setTreatmentCharges(3000);

        OutPatient outPatient = new OutPatient();
        outPatient.setPatientId(102);
        outPatient.setName("Aman");
        outPatient.setAge(30);
        outPatient.setConsultationFees(500);
        outPatient.setTreatmentCharges(1500);

        inPatient.displayPatientDetails();
        System.out.println("Bill Amount: " + inPatient.calculateBill());

        System.out.println();

        outPatient.displayPatientDetails();
        System.out.println("Bill Amount: " + outPatient.calculateBill());
    }
}
