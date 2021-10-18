package com.company;

import com.company.Car;
import com.company.CarAbstractFactory;

public class SkodaFactory implements CarAbstractFactory {
    private String wheel;
    private String trunk;
    private String bumper;

    public SkodaFactory(String wheel, String trunk, String bumper) {
        this.wheel = wheel;
        this.trunk = trunk;
        this.bumper = bumper;
    }

    @Override
    public Car createCar() {
        return new Skoda(wheel,trunk,bumper);
    }
}
