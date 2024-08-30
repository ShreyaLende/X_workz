package com.xworkz.chaining.washingmachine;

public class WashingMachineRunner {
        public static void main(String[] args) {

            Megha megha = new Megha();
            megha.demonstrate();
            System.out.println("********************");

            WashingMachine lakshmiMachine = new WashingMachine();
            Laxmi lakshmi = new Laxmi();
            lakshmi.operateWashingMachine(lakshmiMachine);
            System.out.println("********************");

            Abhishek abhishek = new Abhishek(lakshmiMachine);
            abhishek.displayMachineDetails();
            System.out.println("********************");

            Bhumika bhukima = new Bhumika(lakshmiMachine);
            WashingMachine bhumikaMachine = bhukima.getMachine();
            bhumikaMachine.show();
            System.out.println("********************");


            Nayana nayana = new Nayana();
            nayana.process();
        }
    }


