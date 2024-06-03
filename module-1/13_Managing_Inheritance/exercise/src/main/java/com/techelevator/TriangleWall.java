package com.techelevator;

public class TriangleWall extends Wall{

    private int height;
    private int base;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public int getArea() {
        return base / height;
    }

    @Override
    public String toString() {
        return getName() + "(" + base + "x" + height + ")" + "triangle";
    }
}
