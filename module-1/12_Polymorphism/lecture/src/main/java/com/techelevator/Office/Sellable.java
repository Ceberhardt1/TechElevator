package com.techelevator.Office;

public interface Sellable {

    double getPrice();

    int getInventoryCount();

    void setPrice(double price);

    int addToInventory(int quantityToAdd);

    int removeFromInventory(int quantityToRemove);

    String getItemName();

}
