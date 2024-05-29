package billpayment;

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.List;

public class BillPaymentApp {



    // METHOD OVERLOADING:
    // - same class
    // - same method name, same return type
    //METHOD OVERRIDE: (ALLOWS SPECIALIZATION)
    // - Parent/child
    // - same return method/ name

    public static void main(String[] args) {

        Bill myBill = new Bill("ABC" , 50.00);

        NetflixBill nfb = new NetflixBill("DEF", 17.99, 99);

        ElectricBill eb = new ElectricBill("GKH", 100.98, 10, true);

        Bill newNFBBill = new NetflixBill("DDDD", 120.00, 30);

        Bill newEBill = new ElectricBill("EEEE", 10.00, 10, true);

//        List<Bill> myBills = new ArrayList<>();
//        myBill.add(newNFBBill);
//        myBill.add(newEBill);

        nfb.payBill(10.00);
        eb.payBill(100.00);






    }


}
