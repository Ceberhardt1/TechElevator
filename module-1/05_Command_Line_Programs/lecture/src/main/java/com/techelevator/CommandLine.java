package com.techelevator;

import java.util.Scanner;

public class CommandLine {

    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);

        while(true){

            System.out.println("Bart Simpson: Are we there yet? (Y)es or (N)o ");
            String response = keyBoardScanner.nextLine();


            if(response.equalsIgnoreCase("Yes")){
                System.out.println("We are there!");
                break;

            }
            else if(response.equalsIgnoreCase("No")){
                System.out.println("We are not there!");
            }
            else{
                System.out.println("Error");
            }
        }


    }



}
