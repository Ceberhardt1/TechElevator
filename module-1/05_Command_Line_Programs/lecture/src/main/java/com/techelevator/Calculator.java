package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Calculator {


    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Please enter all the numbers you want added together, seperate by commas");
        String numbers = numberScanner.nextLine();

        String[] insideNums = numbers.split(",");

        int sum = 0;

        for(int i = 0; i < insideNums.length; i++){
            int value = Integer.parseInt(insideNums[i]);

             sum += value;
        }

        System.out.println(sum);







    }

}
