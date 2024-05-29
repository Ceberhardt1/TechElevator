package com.techelevator.Office;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        Marker marker = new Marker("Expo", "black", .50, 20, " Expo Marker - Dry Erase");
        Stapler redStapler = new Stapler("PaperMate", "Red", 2.00, 5, "SuperCool stapler");
        Stapler normalStapler = new Stapler("PaperMate", "Black", 1.00, 50, "Boring stapler");


        List<Sellable> items = new ArrayList<>();
        items.add(marker);
        items.add(redStapler);
        items.add(normalStapler);

        for(Sellable item: items){

            System.out.println(item.getItemName() + " " + item.getPrice());

        }

    }
}
