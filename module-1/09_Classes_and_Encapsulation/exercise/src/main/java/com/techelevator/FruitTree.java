package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int piecesOfFruitLeft){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }


    public Boolean pickFruit(int numberOfPiecesToRemove){

        if(piecesOfFruitLeft > 0) {

            piecesOfFruitLeft -= numberOfPiecesToRemove;

            if (piecesOfFruitLeft < 0){
                return false;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
