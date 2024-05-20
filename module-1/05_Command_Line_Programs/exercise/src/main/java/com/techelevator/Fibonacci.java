package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner fibonacci = new Scanner(System.in);
		System.out.println("Please enter a number");
		int maxNum = fibonacci.nextInt();

		String zero = "0";
		String zeroTwo = "0, 1";
// ------------------------------------------------------------ This section is good!-----------------------------------
		int numOne = 0;
		int numTwo = 1;
		int result = 1 ;

// -------------------------------------------------------------Defining the numbers and the sum -----------------------
//		String starterNum = ("0, ");
// -------------------------------------------------------------Storing the starting numbers into a value---------------
		if(maxNum <= 0 ){
			System.out.print(zeroTwo);
		}
		else{
			while(result <= maxNum){
				result = numOne + numTwo;
				numOne = numTwo;
				numTwo = result;

				zero += "," + numOne;

			}
			System.out.print(zero);
		}





	}
//-------------------------------------------------------------Creating a while loop to loop through the set of numbers,
// ------------------------------------------------------------until the last number is under the Users Input number----
}
