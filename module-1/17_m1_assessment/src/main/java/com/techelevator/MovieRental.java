package com.techelevator;

public class MovieRental {
    private String title;

    private String format;

    private boolean isPremiumMovie;

    private double rentalPrice;

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;

    }
    public double determinesAMoviesLateFees(int daysLate){
        if(daysLate == 0){
            return 0.00;
        }
        else if(daysLate == 1){
            return 1.99;
        }
        else if(daysLate == 2){
            return 3.99;
        }
        else{
            return 19.99;
        }
    }

    @Override
    public String toString() {
        return "MOVIE:" + title + "-" + "FORMAT: " + format + "-" + "PRICE " + rentalPrice;
    }
}
