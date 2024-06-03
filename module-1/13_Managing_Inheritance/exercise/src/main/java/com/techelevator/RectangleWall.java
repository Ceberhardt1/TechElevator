package com.techelevator;

import java.util.jar.Attributes;

public class RectangleWall extends Wall{

    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }


    @Override
    public String toString() {
        return getName() + " (" + length + "x" + height + ") rectangle";
    }
    @Override
    public int getArea() {
        return height * length;
    }

}
