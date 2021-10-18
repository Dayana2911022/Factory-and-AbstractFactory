package com.company;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }
    private static void testAbstractFactory() {
        Car toyota= CarFactory.getCar(new ToyotaFactory("2500","Trunk"," and Bamper 2021y. "));
        Car skoda= CarFactory.getCar(new SkodaFactory("Skoda Octavia RS Wheel","Trunk"," and Bamper 2020y. "));
        System.out.println("AbstractFactory Toyota Config::"+toyota);
        System.out.println("AbstractFactory Skoda Config::"+skoda);
    }
}
