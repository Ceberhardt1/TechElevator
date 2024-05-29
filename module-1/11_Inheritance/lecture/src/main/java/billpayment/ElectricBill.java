package billpayment;

public class ElectricBill extends Bill{

    private int wattsUsed = 0;
    private boolean isLateCharge = false;

    public ElectricBill(String accountNumber, double baseBalance, int wattsUsed, boolean isLateCharge) {
        super(accountNumber, baseBalance + (wattsUsed * 1.9999));
        this.wattsUsed = wattsUsed;
        this.isLateCharge = isLateCharge;
    }

    public void payBill(double paymentAmount){
        double lateNightFee = 10.00;
        if(this.isLateCharge){
            paymentAmount = paymentAmount - lateNightFee;
        }
        super.payBill(paymentAmount);
    }

    public int getWattsUsed() {
        return wattsUsed;
    }

    public void setWattsUsed(int wattsUsed) {
        this.wattsUsed = wattsUsed;
    }
}
