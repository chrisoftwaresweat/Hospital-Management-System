import java.util.Scanner;

public class HospitalMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Patient[] patients = new Patient[10];
        Doctor[] doctors = new Doctor[10];
        Admission admission = new Admission();

        int patientCount = 0, doctorCount = 0;
        int userChoice;

        do {

            System.out.println("\nWELCOME TO TIAN MEDICAL CENTER\n");
            System.out.println("HOSPITAL MENU");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Assign Doctor / Room");
            System.out.println("6. Request Medical Service");
            System.out.println("7. Generate Bill");
            System.out.println("8. EXIT");
            System.out.print("Enter your choice: ");

            userChoice = scanner.nextInt();

            switch (userChoice) {

                //ADD PATIENT
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String pName = scanner.next();
                    System.out.print("Enter Age: ");
                    int pAge = scanner.nextInt();

                    patients[patientCount] = new Patient(pName, pAge);
                    patientCount++;

                    System.out.println("Patient Added Successfully!");
                    break;
                    
                //ADD DOCTOR
                case 2:
                    System.out.print("Enter Doctor Name: ");
                    String dName = scanner.next();
                    System.out.print("Enter Age: ");
                    int dAge = scanner.nextInt();
                    System.out.print("Enter Specialization: ");
                    String spec = scanner.next();

                    doctors[doctorCount] = new Doctor(dName, dAge, spec);
                    doctorCount++;

                    System.out.println("Doctor Added Successfully!");
                    break;

                //VIEW PATIENTS
                case 3:
                    for (int i = 0; i < patientCount; i++) {
                        patients[i].displayInfo();
                        System.out.println("---------------------------------------------");
                    }
                    break;

                //VIEW DOCTORS
                case 4:
                    for (int i = 0; i < doctorCount; i++) {
                        doctors[i].displayInfo();
                        System.out.println("---------------------------------------------");
                    }
                    break;

                //ASSIGN DOCTOR + ROOM
                case 5:

                    System.out.println("Select Patient:");
                    for (int i = 0; i < patientCount; i++) {
                        System.out.printf("%d. %s\n", i + 1, patients[i].getName());
                    }

                    System.out.print("Which patient: ");
                    int pIndex = scanner.nextInt() - 1;

                    if (pIndex < 0 || pIndex >= patientCount) {
                        System.out.println("Invalid patient selection!");
                        break;
                    }

                    System.out.println("Select Doctor:");
                    for (int i = 0; i < doctorCount; i++) {
                        System.out.printf("%d. %s\n", i + 1, doctors[i].getName());
                    }

                    System.out.print("Which doctor: ");
                    int dIndex = scanner.nextInt() - 1;

                    if (dIndex < 0 || dIndex >= doctorCount) {
                        System.out.println("Invalid doctor selection!");
                        break;
                    }

                    patients[pIndex].setDoctor(doctors[dIndex]);

                    int room = admission.assignRoom(patients[pIndex]);

                    if (room != -1) {
                        patients[pIndex].setRoomNumber(room);
                    } else {
                        System.out.println("No room assigned.");
                    }

                    System.out.println("Doctor and Room Assignment Completed!");
                    break;

                //MEDICAL SERVICE
                case 6:

                    System.out.println("Select Patient:");
                    for (int i = 0; i < patientCount; i++) {
                        System.out.printf("%d. %s\n", i + 1, patients[i].getName());
                    }

                    System.out.print("Which patient: ");
                    int labIndex = scanner.nextInt() - 1;

                    if (labIndex < 0 || labIndex >= patientCount) {
                        System.out.println("Invalid patient selection!");
                        break;
                    }

                    System.out.println("\nMEDICAL SERVICE");
                    System.out.println("1. Lab Test");
                    System.out.println("2. Consultation");
                    System.out.print("Select service: ");
                    int serviceChoice = scanner.nextInt();

                    MedicalService service = null;

                    switch (serviceChoice) {

                        case 1:
                            service = new LabTest();
                            break;

                        case 2:
                            service = new Consultation();
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }

                    if (service == null) {
                        break;
                    }

                    patients[labIndex].addService(service);
                    System.out.println("Medical Service Added Successfully!");
                    break;

                //BILLING
                case 7:

                    System.out.println("Select Patient:");
                    for (int i = 0; i < patientCount; i++) {
                        System.out.printf("%d. %s\n", i + 1, patients[i].getName());
                    }

                    System.out.print("Which patient: ");
                    int billIndex = scanner.nextInt() - 1;

                    if (billIndex < 0 || billIndex >= patientCount) {
                        System.out.println("Invalid patient selection!");
                        break;
                    }

                    System.out.println("\nBILLING TYPE");
                    System.out.println("1. InPatient");
                    System.out.println("2. OutPatient");
                    System.out.print("Select type: ");
                    int type = scanner.nextInt();

                    switch (type) {

                        case 1:
                            patients[billIndex].setBilling(new InPatient());
                            break;

                        case 2:
                            patients[billIndex].setBilling(new OutPatient());
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }

                    System.out.println("Final Bill: " + patients[billIndex].getFinalBill());
                    break;
                    
                //EXIT PROGRAM
                case 8:
                    System.out.println("System Closed.");
                    break;

                //INVALID INPUT DETECTION    
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (userChoice != 8);

        scanner.close();
    }
}
