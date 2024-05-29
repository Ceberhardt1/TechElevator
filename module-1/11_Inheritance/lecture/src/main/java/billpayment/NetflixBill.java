package billpayment;

public class NetflixBill extends Bill {

    private int hoursWatched;

    public NetflixBill(String accountNumber, double balance, int hoursWatched) {
        super(accountNumber, balance); // passes these values up to the parent's constructor (Super = superclass/Parent)\
        this.hoursWatched = hoursWatched;


    }

    public int getHoursWatched() {
        return hoursWatched;
    }

    public void setHoursWatched(int hoursWatched) {
        this.hoursWatched = hoursWatched;
    }
}
