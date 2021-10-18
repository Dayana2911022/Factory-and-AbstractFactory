package com.company;

import com.company.Car;
import com.company.CarAbstractFactory;

public class CarFactory {
    public static Car getCar(CarAbstractFactory factory){
        return factory.createCar();
    }
}
