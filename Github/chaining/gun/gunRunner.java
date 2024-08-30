package com.xworkz.chaining.gun;

import com.xworkz.chaining.gun.*;
import com.xworkz.chaining.washingmachine.WashingMachine;

public class gunRunner {
    public static void main(String[] args) {
        Gun myGun = new Gun();
        Soldier soldier = new Soldier();
        myGun.display();
        System.out.println("*******************");
        Police police = new Police();
        police.useGun(myGun);
        System.out.println("*******************");
        Dboss dboss = new Dboss(myGun);
        dboss.showGunDetails();
        System.out.println("*******************");
        Godse godse = new Godse(myGun);
        Gun retrievedGun = godse.getGun();
        retrievedGun.display();
    }
}


