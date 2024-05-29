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
        int updatedBalance = balance - amountToWithdraw;
        int newlyUpdated = balance - amountToWithdraw - addCharge;

        if(newlyUpdated < 0){
            return balance;
        } else if (updatedBalance  < 150) {
            int wAmount = amountToWithdraw + addCharge;
            balance = super.withdraw(wAmount);

        }
        else{
            balance = super.withdraw(amountToWithdraw);
        }
        return balance;
    }

}
