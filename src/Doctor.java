public class Doctor extends Person{
    private String specialization;

    Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Doctor: %s\tSpecialization: %s\n", getName(), specialization);
    }
}
