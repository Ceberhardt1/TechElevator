package com.techelevator.Office;

public class Marker implements Sellable{

    private String brand;
    private String color;
    private double price;
    private int quantityOnHand;
    private String itemName;


    public Marker(String brand, String color, double price, int quantityOnHand, String itemName) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
        this.itemName = itemName;
    }

    //---------------------GETTERS/SETTER---------------------------
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

//---------------------implements----------------------------------------------
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getInventoryCount() {
        return quantityOnHand;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int addToInventory(int quantityToAdd) {
        return quantityOnHand = quantityOnHand + quantityToAdd;
    }

    @Override
    public int removeFromInventory(int quantityToRemove) {
        return quantityOnHand = quantityOnHand - quantityToRemove;
    }

    @Override
    public String getItemName() {
        return itemName;
    }
}
