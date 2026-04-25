public abstract class MedicalService {
    protected String serviceName;
    protected double fee;

    public MedicalService(String serviceName, double fee) {
        this.serviceName = serviceName;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public abstract void performService();
}