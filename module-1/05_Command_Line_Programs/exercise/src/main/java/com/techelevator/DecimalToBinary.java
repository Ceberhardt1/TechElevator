package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner seriesDecimals = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (seperated by spaces");
		int startingNum = seriesDecimals.nextInt();


		String binaryEnd = "";

		while(startingNum >= 1){
			if(startingNum % 2 == 0){
				startingNum = (startingNum / 2);
				binaryEnd = 0 + binaryEnd;
			}

			else if (startingNum % 2 == 1) {
				startingNum = (startingNum / 2);
				binaryEnd = 1 + binaryEnd;
			}

			else if (startingNum < 1) {
				break;
			}
		}
		System.out.print(startingNum + "in binary is " + binaryEnd);
		System.out.print(binaryEnd);
	}

}