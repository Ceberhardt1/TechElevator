package com.techelevator;

public class SquareWall extends RectangleWall{

    private int sideLength;
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);

    }

    @Override
    public String toString() {
        return getName() + "(" + sideLength + "x" + sideLength + ")" + "square";
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
