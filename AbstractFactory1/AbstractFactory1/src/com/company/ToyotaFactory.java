package com.company;

import com.company.Car;
import com.company.CarAbstractFactory;

public class ToyotaFactory implements CarAbstractFactory {
    private String wheel;
    private String trunk;
    private String bumper;

    public ToyotaFactory(String wheel, String trunk, String bumper) {
        this.wheel = wheel;
        this.trunk = trunk;
        this.bumper = bumper;
    }

    @Override
    public Car createCar() {
        return new Toyota(wheel,trunk,bumper);
    }
}
