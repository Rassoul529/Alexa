package com.company;

public class Alexa {
    private Door mydoor;
    private LightSwitch mylight;

    public Alexa(Door mydoor, LightSwitch mylight) {
        this.mydoor = mydoor;
        this.mylight = mylight;
    }

    public Door getMydoor() {
        return mydoor;
    }

    public void setMydoor(Door mydoor) {
        this.mydoor = mydoor;
    }

    public LightSwitch getMylight() {
        return mylight;
    }

    public void setMylight(LightSwitch mylight) {
        this.mylight = mylight;
    }
    public void openAndCloseTheDoor(){
        mydoor.openAndShutDoor();

    }
    public void flipSwitch(){
        mylight.flipSwitch();

    }
    public void printStatus(){
        System.out.println("The light is on = "+mylight.getOn()+" The door is open " + mydoor.isOpen());
    }
}


