package com.techelevator;

import com.techelevator.restaurant.Burger;
import com.techelevator.restaurant.Ingredient;
import com.techelevator.restaurant.Order;

import java.util.Scanner;

public class OrderUI {

    private Scanner myScanner = new Scanner(System.in);

    public Order takeOrder(){
        Order newOrder = new Order();

        //Create a burger
        Burger burger = new Burger();


        //Ask for ingredients & bunType
        System.out.println("What type of bun would you like?");
        String bunType = myScanner.nextLine();
        burger.setBunType(bunType);

        System.out.println("How would you like your burger cooked?");
        String howCooked = myScanner.nextLine();
        burger.setHowCooked(howCooked);

        System.out.println("Please enter your desired ingredients (seperated by commas)");
        String ingedientsAsString = myScanner.nextLine();
        String[] ingredients = ingedientsAsString.split(", ");

        //loop through the Strini[] and take each item

        for( String ingredient : ingredients){
            Ingredient newIngredient = new Ingredient();
            newIngredient.setIngredientName(ingredient);
            burger.addIngredient((newIngredient));
        }

        //Add burger to order
        newOrder.addBurgerToOrder(burger);



        return newOrder;
    }



}
