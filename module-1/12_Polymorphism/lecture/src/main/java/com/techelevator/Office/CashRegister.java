package com.techelevator.Office;

public class CashRegister {

    private double balance;

    private void takeCash(double amount){
        balance = balance + amount;
    }

    private double giveCash(double amountGiven){
        return amountGiven - this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
