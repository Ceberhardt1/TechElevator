package com.techelevator;

public class ScratchPad {

    public static void main(String[] args) {

        System.out.printf("This is my scratch pad!");
        ScratchPad scratchPad = new ScratchPad();
        int result = scratchPad.addNumbers(20, 30);
        System.out.println(result);


        boolean isSafe = scratchPad.areWeSafeFromDogsBees(true, false);
        if(isSafe){
            System.out.println("We are Safe!");
        }
        else {
            System.out.println("We are not Safe!");
        }


        int creditScore = 700;
        int userResult = scratchPad.userInterest(creditScore);
        System.out.println("User Interest will be" + " " + userResult + "%");


    }
    public int addNumbers(int num1, int num2){
       // Take num one and two and add them together, then return sum //

       int sum = num1 + num2;

       return sum;


    }

    public boolean areWeSafeFromDogsBees(boolean areDogsPresent, boolean areBeesPresent){
        if(areBeesPresent || areDogsPresent){
            return false;
        }
        else{
            return true;
        }


    }


    int rate = 0;
    public int userInterest(int creditScore){

        if(creditScore >= 800 && creditScore <= 850){
            rate =  3;
        }
        else if(creditScore >= 740 && creditScore <= 799){
             rate = 4;
        }
        else if(creditScore >= 670 && creditScore <= 739){
            rate = 5;
        }
        else if(creditScore >= 300 && creditScore <= 669){
             rate = 6;
        }
        else{
            rate = 150;
        }
        return rate;
    }



}
