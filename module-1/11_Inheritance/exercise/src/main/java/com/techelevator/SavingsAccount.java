package com.techelevator;

public class SavingsAccount extends BankAccount {


    public SavingsAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    public SavingsAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }


    public int withdraw(int amountToWithdraw){
        int balance = getBalance();
        int addCharge = 2;
        if(balance < 150){
            super.withdraw(getBalance() - addCharge);
        }
        else{
            super.withdraw()
        }
    }

}
