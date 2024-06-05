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

    @Override
    public String toString() {
        return "MOVIE:" + title + "-" + "FORMAT: " + format + "-" + "PRICE " + rentalPrice;
    }
}
