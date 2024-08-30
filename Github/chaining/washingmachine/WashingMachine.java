package com.xworkz.chaining.washingmachine;

public class WashingMachine {
    private String brand="Samsung";
    private String type="Front Load";
    private int capacity=6;

    public void rinse() {
        System.out.println(brand + " is rinsing!");
    }


    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " liters");
    }
}

