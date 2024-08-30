package com.xworkz.chaining.washingmachine;

public class Nayana {
    public void process() {

        WashingMachine myMachine = new WashingMachine();

        Bhumika bhukima = new Bhumika(myMachine);

        WashingMachine receivedMachine = bhukima.getMachine();

        receivedMachine.show();
    }
}

