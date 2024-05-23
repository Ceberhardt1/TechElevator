package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Burger> order = new ArrayList<>();

        Burger myBurger = new Burger("grass fed bison");

        myBurger.setBunType("Gluten Free");

        myBurger.setHowCooked("Well Done");
        order.add(myBurger);

        Burger yourBurger = new Burger("beef");
        yourBurger.setHowCooked("Still mooing");
        yourBurger.setBunType("wheat");
        order.add(yourBurger);

//        System.out.println(myBurger.getBunType() + " " + myBurger.getHowCooked());
//        System.out.println(yourBurger.getBunType() + " " + yourBurger.getHowCooked());

        //print the order

        for(Burger b: order){
            System.out.println(b.getBunType() + " " + b.getHowCooked());
        }


        //Call the calc for no real reason other than to show method

        Calculator calc = new Calculator();
        int result = calc.add2(5, 4);
        System.out.println(result);
        int result2 = calc.add3(2,2, 2);
        System.out.println(result2);

    }

}
