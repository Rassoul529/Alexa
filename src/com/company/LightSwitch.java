package com.company;

public class LightSwitch {
    private boolean on;

    public LightSwitch(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void flipSwitch(){
        if(on==true) {
            on=false;
        }else{
            on=true;
        }
    }
}
