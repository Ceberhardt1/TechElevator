package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {



	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();





	}
	private static void printMovieList(ArrayList<String>rentalObjects){
		for(int i = 0; i < rentalObjects.size(); i++){
			System.out.println(rentalObjects.get(i));
		}
	}

	private void run() {
		//The right way to do it.
		MovieRental rentalOne = new MovieRental("SuperBad", "DVD", true);
           //start coding here... You will call other class or classes from here as needed, or write additional methods. 


	}

}
