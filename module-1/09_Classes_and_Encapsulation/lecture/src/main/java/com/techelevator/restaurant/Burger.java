package com.techelevator.restaurant;

public class Burger {

    //Class variables go here//
    private String bunType;

    private String howCooked; //Well done, rare, medium

    private String meatType;

    //TODO - COMEBACK LATER AND ADD INGREDIENTS LIST<>//

    //Constructor //

    public Burger(String meatType){
        this.meatType = meatType;
    }
//-------------default Constructor//-------------
    public Burger(){

    }
//---------------------------------------------------
    //Public Methods//



    //Private Methods//



    // Getters/Setters


    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public String getHowCooked() {
        return howCooked;
    }

    public void setHowCooked(String howCooked) {
        this.howCooked = howCooked;
    }


}
