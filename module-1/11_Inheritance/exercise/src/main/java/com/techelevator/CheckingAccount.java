package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);

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
