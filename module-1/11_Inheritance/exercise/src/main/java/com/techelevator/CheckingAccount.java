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
        if(getBalance() < 0 && getBalance() > -100){;
            balance = super.withdraw(amountToWithdraw - overdraft);
        }
        else{
            balance = super.withdraw(amountToWithdraw);
        }

        return(balance);
    }

}
