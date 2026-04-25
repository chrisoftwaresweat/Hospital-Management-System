public class OutPatient extends Billing{
    @Override
    public double calculateBill(double serviceFee) {
        double extraHospitalCharge = 200;
        return serviceFee + extraHospitalCharge;
    }
}
