public class Patient extends Person {

    private Doctor doctor;//stores the assigned doctor for this patient to allow flexible doctor assignment
    private MedicalService[] services = new MedicalService[10];
    private int serviceCount = 0;

    private int roomNumber;//stores the assigned room number for this patient
    private Billing billing;//stores the billing type (inpatient or outpatient)

    public Patient(String name, int age) {
        super(name, age);
    }

    /*
    we use getter and setter methods for the doctor inside the patient class
    to manage the relationship between a patient and a doctor in a flexible way.

    this allows a patient to be assigned to different doctors depending on availability,
    instead of being permanently tied to only one doctor.

    it also supports encapsulation by controlling how the doctor field is accessed
    and modified from outside the class.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public void addService(MedicalService service) {
        if (serviceCount < services.length) {
            services[serviceCount] = service;
            serviceCount++;
        }
    }

    public double getTotalFees() {
        double total = 0;
        for (int i = 0; i < serviceCount; i++) {
            total += services[i].getFee();
        }
        return total;
    }

    //final bill (services + billing type)
    public double getFinalBill() {
        if (billing == null) {
            return getTotalFees();
        }
        return billing.calculateBill(getTotalFees());
    }

    @Override
    public void displayInfo() {
        System.out.printf("Patient: %s\tAge: %d\n", getName(), getAge());

        if (roomNumber != 0) {
            System.out.printf("Room: %02d\n", roomNumber);
        } else {
            System.out.println("No room assigned.");
        }

        if (doctor != null) {
            System.out.printf("Assigned Doctor: %s\n", doctor.getName());
        } else {
            System.out.println("No doctor assigned.");
        }

        System.out.printf("Total Bill: %.2f\n", getFinalBill());
    }
}