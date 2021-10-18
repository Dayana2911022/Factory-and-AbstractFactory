package com.company;

public abstract class Car {
    public abstract String getWheel();
    public abstract String getTrunk();
    public abstract String getBumper();

    @Override
    public String toString(){
        return "Wheel= "+this.getWheel()+", Trunk="+this.getTrunk()+", Bumper="+this.getBumper();
    }
}
