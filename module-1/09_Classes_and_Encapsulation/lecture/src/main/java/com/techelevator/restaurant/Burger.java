package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    //Class variables go here//
    private String bunType;

    private String howCooked; //Well done, rare, medium

    private String meatType;

   private List<Ingredient> toppings = new ArrayList<>();

    //Constructor //

    public Burger(String meatType){
        this.meatType = meatType;
    }
//-------------default Constructor//-------------
    public Burger(String meatType, List<Ingredient> toppings){
        if(toppings == null){
            this.toppings = new ArrayList<>();
        }
        else{
            this.toppings = toppings;
        }

        this.meatType = meatType;

    }
//---------------------------------------------------
    //Public Methods//

    public void addIngredient(Ingredient ingredient){
        toppings.add(ingredient);
    }


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

    public List<Ingredient> getToppings() {
        return toppings;
    }
}
