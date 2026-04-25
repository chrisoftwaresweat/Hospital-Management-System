public class InPatient extends Billing {

    @Override
    public double calculateBill(double serviceFee){
        double roomFee = 1000;
        double hospitalFee = 500;
        return serviceFee + roomFee + hospitalFee;
    }
}