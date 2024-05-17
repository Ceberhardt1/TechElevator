package com.techelevator;

import java.util.Scanner;

public class CommandLineTwo {
// OPTION #1
//    public static void main(String[] args) {
//
//        Scanner ageCalculator = new Scanner(System.in);
//
//        System.out.println("Please Enter Your Age: ");
//        int humanAge = ageCalculator.nextInt();
//        ageCalculator.nextLine();
//
//
//        System.out.println("Please Enter Your Favorite Color: ");
//        String color = ageCalculator.nextLine();
//
//        System.out.println("Your age is: " + humanAge + ", Additionally, Your Favorite color is: " + color);
//
//
//
//
//
//    }


    // OOPTION 2
    public static void main(String[] args) {

        Scanner ageCalculator = new Scanner(System.in);

        System.out.println("Please Enter Your Age: ");
        String ageAsString = ageCalculator.nextLine();

        int ageHumanAsInteger = Integer.parseInt(ageAsString);
        int ageInDogYears = ageHumanAsInteger * 7;

        System.out.println("A human who is: " + ageHumanAsInteger + " Years Old" + " " + ",is " + ageInDogYears + " Years old in dog years");





    }




}
