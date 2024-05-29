package com.techelevator;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;

    private int balance;


    public BankAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public int deposit(int amountToDeposit){
        if(amountToDeposit > 0){
            amountToDeposit = amountToDeposit + balance;
        }
        return this.balance;
    }

    public int withdraw(int amountToWithdraw){
        if(amountToWithdraw > 0){
           amountToWithdraw =- balance;
        }
        return this.balance;
    }





    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
