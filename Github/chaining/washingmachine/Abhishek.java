package com.xworkz.chaining.washingmachine;

public class Abhishek {
    private WashingMachine machine;


    public Abhishek(WashingMachine machine) {
        this.machine = machine;
    }

    public void displayMachineDetails() {
        machine.show();
    }
}

