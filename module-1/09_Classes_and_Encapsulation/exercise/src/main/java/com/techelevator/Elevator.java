package com.techelevator;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean isDoorOpen;

    public Elevator(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
        this.currentFloor = 1;
        this.isDoorOpen = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void openDoor(){
        isDoorOpen = true;
    }
    public void closeDoor(){
        isDoorOpen = false;
    }
    public void goUp(int desiredFloor){

        if(!isDoorOpen){
            if(this.currentFloor < desiredFloor){
                if(desiredFloor <= this.numberOfFloors){
                    this.currentFloor = desiredFloor;
                }
            }
        }
    }
    public void goDown(int desiredFloor){
        if(!isDoorOpen){
            if(this.currentFloor > desiredFloor){
                if(desiredFloor >= 1){
                    this.currentFloor = desiredFloor;
                }
            }
        }
    }
}
