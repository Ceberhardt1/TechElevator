package com.techelevator;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.SplittableRandom;

public class ClassWork {

    public static void main(String[] args) {
        // List Examples:


        //BE ABLE TO DECLARE AND INSTANTIATE ARRAYLIST//

        List<String> ninjaNames = new ArrayList<String>();
        List<Integer> testScores = new ArrayList<>();
        List<Boolean> truthOrFalse = new ArrayList<>();

        //BE ABLE TO PUT THINGS INTO OUR LIST:
        testScores.add(75);
        testScores.add(80);
        testScores.add(43);
        testScores.add(90);

        ninjaNames.add("Cole");
        ninjaNames.add("ryan");
        ninjaNames.add("madeline");
        ninjaNames.add("andy");

        truthOrFalse.add(false);
        truthOrFalse.add(true);


        //GETTING THINGS OUT
       int scoreATIndex1 = testScores.get(3);
        System.out.println(scoreATIndex1);

        // BE ABLE TO TO REMOVE FROM A LIST
        ninjaNames.remove(0);
        ninjaNames.add(0,"Jared");

        ninjaNames.contains("Cole");
        boolean isColeInMyList = ninjaNames.contains("Cole");

        if(isColeInMyList == false){
            ninjaNames.add("Cole");

        }
        System.out.println(ninjaNames);

        //BE ABLE TO LOOP USING A REGUALR FOR LOOP
        for (int i = 0; i < ninjaNames.size() ; i++) {
            if(ninjaNames.get(i).equalsIgnoreCase("ryan")){
                System.out.print("WE REMOVED :"+ ninjaNames.get(i));
                ninjaNames.remove(i);

                break;
            }

        }



        //BE ABLE TO LOOP USING AMN ENHANCED FOR LOOP (FOR EACH)

        for (String ninja : ninjaNames) {

        }

        for (Integer scores : testScores) {

        }



        //BE ABLE TO TAKE AN ARRAY AND TURN IT INTO A LIST

        double[] measure = new double[]{2.0 , 3.0 , 4.0};

        List<Double> mList = new ArrayList<>();

        for (int i = 0; i < measure.length ; i++) {
            mList.add(measure[i]);
        }
        //BE ABLE TO TAKE A LIST AND CONVERT INTO AN ARRAY

        List<Float> floties = new ArrayList<>();
        floties.add(1.0f);

        Float[] floats = new Float[floties.size()];

        for (int i = 0; i < floties.size(); i++) {
            floats[i] = floties.get(i);
        }


    }
}
