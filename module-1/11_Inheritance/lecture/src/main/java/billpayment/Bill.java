package billpayment;

public class Bill {
    // instance, properites, member variables
    private String accountNumber;
    private double balance = 0;


    public Bill(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void payBill(double paymentAmount){
        if(paymentAmount > 0){
            balance = balance - paymentAmount;
        }

    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void add(Bill newEBill) {
    }
}
