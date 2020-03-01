package com.company;

public class Door {
    private boolean open;

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Door(boolean open) {
        this.open = open;

    }
    public void openAndShutDoor(){
        if(open==true){
            open=false;

        }else {
            open=true;
        }
    }
}
