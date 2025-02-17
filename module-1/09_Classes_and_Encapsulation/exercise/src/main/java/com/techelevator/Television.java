package com.techelevator;

import java.util.concurrent.ThreadPoolExecutor;

public class Television {

    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public Television(){
        this.isOn = false;
        this.currentVolume = 2;
        this.currentChannel = 3;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
//---------------------------
    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
        currentChannel = 3;
        currentVolume = 2;
    }
    public void changeChannel(int newChannel){
        if(isOn == true && newChannel <= 18 && newChannel >= 3){
            currentChannel = newChannel;
        }
    }
    public void channelUp(){
        if(isOn == true ){
            currentChannel ++;
            if(currentChannel > 18 ){
                currentChannel = 3;
            }
        }
    }
    public void channelDown(){
        if(isOn == true){
            currentChannel --;
            if(currentChannel < 3){
                currentChannel = 18;
            }
        }
    }
    public void raiseVolume(){
        if(isOn == true){
            if(currentVolume < 10){
                currentVolume ++;
            }
        }
    }
    public void lowerVolume(){
        if(isOn == true){

            if(currentVolume > 0){
                currentVolume --;
            }
        }
    }
}
