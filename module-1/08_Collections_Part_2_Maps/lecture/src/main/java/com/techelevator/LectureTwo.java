package com.techelevator;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LectureTwo {

    public static void main(String[] args) {

        // BE ABLE TO DECLARE AND INSTANTIATE A MAP

        Map<String, Integer> homes = new HashMap<>();
        Map<String, String> stringMap = new HashMap<>();
        Map<Integer, String> numsAsString= new HashMap<>();

        // Putting things into the map
        homes.put("43012", 17);
        homes.put("43019", 4);
        homes.put("43014", 778);

        //ABLE TO GET THINGS OUT

       int homesForSale43012 = homes.get("43012");
        System.out.println(homesForSale43012);
        System.out.println(homes);

        Integer homesForSaleIn43088 = homes.get("43088");


        if(homesForSaleIn43088 != null){
            System.out.println(homesForSaleIn43088);
        }
        else{
            System.out.println("Home not found");
        }

        //SEE IF A MAP CONTAINS A KEY
        if(homes.containsKey("43019")){
            System.out.println("We found 43019");
        }

        if(homes.isEmpty()){
            //we have empty map
        }

        //BE ABLE TO LLOOP THROUGH A MAP USING A SET
        Set<String> mySet = new HashSet<>(); // Create a random set object (not used below)
        Set<String> keys = homes.keySet(); // returns a set of keys

        for(String key : keys){
          //  System.out.println(" Key - " + key + ", has a value of " + homes.get(key));
        }

        for (Map.Entry<String, Integer>  entry : homes.entrySet()){
            System.out.println(" Key - " + entry.getKey() + ", has a value of " + entry.getValue());
        }

    }





}
