package com.company;

public class Main {

    public static void main(String[] args) {
        Door mydoor = new Door(true);
        LightSwitch mylight = new LightSwitch(true);
        Alexa myalexa = new Alexa(mydoor, mylight);
        myalexa.printStatus();
        myalexa.flipSwitch();
        myalexa.openAndCloseTheDoor();
        myalexa.printStatus();
    }
}
