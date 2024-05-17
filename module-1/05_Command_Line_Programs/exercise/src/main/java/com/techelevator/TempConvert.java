package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner  tempConverter = new Scanner(System.in);
		System.out.println("Please enter the temperature: ");
		int startingTemp = tempConverter.nextInt();

		Scanner unitDecider = new Scanner(System.in);
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String unitPicked = unitDecider.nextLine();


		if(unitPicked.equalsIgnoreCase("C")){
			System.out.println(startingTemp + unitPicked + " is " + (startingTemp * 1.8 + 32) +  "F");

		}
		else if (unitPicked.equalsIgnoreCase("F")) {
			System.out.println(startingTemp + unitPicked + " is " + ((startingTemp - 32) / 1.8) +  "C");
		}
		else {
			System.out.println("Error");
		}

	}

}
