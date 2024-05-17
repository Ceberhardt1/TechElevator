package com.techelevator;
import java.util.Scanner;
public class LinearConvert {

	public static void main(String[] args) {
		Scanner converter = new Scanner(System.in);
		System.out.println("Please enter the length:");
		int numLength = converter.nextInt();

		Scanner unitMeasurement = new Scanner(System.in);
		System.out.println("Is the measurement in (m)eters, or (f)eet?");
		String actualUnit = unitMeasurement.nextLine();

		if(actualUnit.equalsIgnoreCase("M")){
			System.out.println(numLength + actualUnit + "is" + (numLength / 0.3048) + "f");
		}
		else if(actualUnit.equalsIgnoreCase("F")){
			System.out.println(numLength + actualUnit + " is " + (numLength / 3.2808399) + "m");
		}

	}

}
