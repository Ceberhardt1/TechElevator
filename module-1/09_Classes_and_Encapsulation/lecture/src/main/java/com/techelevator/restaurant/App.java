package com.techelevator.restaurant;

import com.techelevator.OrderUI;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //Create an instance of the UI
        OrderUI ui = new OrderUI();

        //Call the UI to get us a order
        Order newOrder = ui.takeOrder();

        //Print order
        newOrder.printOrder();


    }

}
