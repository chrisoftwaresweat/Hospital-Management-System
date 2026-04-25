public class Consultation extends MedicalService {

    public Consultation() {
        super("Consultation", 500);
    }

    @Override
    public void performService() {
        System.out.println("Doctor Consultation in progress...");
    }
}