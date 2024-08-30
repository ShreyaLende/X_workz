package com.xworkz.chaining.gun;

public class Dboss {
    private Gun gun; // Instance variable

    public Dboss(Gun gun) {
        System.out.println("create gun in Dboss");
        this.gun = gun;
    }

    public void showGunDetails() {
        gun.display();
    }
}

