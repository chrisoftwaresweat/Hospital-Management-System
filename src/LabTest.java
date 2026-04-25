public class LabTest extends MedicalService {

    public LabTest() {
        super("Lab Test", 1150);
    }

    @Override
    public void performService() {
        System.out.println("Performing:\n-Blood Test\n-Urinalysis\n-Stool Exam\n");
    }
}