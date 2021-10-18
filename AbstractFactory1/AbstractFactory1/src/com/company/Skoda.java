package com.company;

import com.company.Car;

public class Skoda  extends Car {
    private String wheel;
    private String trunk;
    private String bumper;

    public Skoda(String wheel, String trunk, String bumper) {
        this.wheel = wheel;
        this.trunk = trunk;
        this.bumper = bumper;
    }

    @Override
    public String getWheel() {
        return "Skoda Octavia RS Wheel";
    }

    @Override
    public String getTrunk() {
        return "Trunk";
    }

    @Override
    public String getBumper() {
        return "Bumper";
    }
}
