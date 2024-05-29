package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }

    public int withdraw(int amountToWithdraw){
        int overdraft = 10;
        int balance = getBalance();
        int updatedBalance = balance - amountToWithdraw;

        if(updatedBalance <= -100){
            return balance;
        }
        else if(updatedBalance < 0){
                int wAmount = amountToWithdraw + overdraft;
                balance = super.withdraw(wAmount);
        }
        else{
            balance = super.withdraw(amountToWithdraw);
        }

        return(balance);
    }

}
