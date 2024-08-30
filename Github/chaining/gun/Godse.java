package com.xworkz.chaining.gun;

public class Godse {
    private Gun gun;

    public Godse(Gun gun) {
        System.out.println("create gun in godse");
        this.gun = gun;
    }

    public Gun getGun() {
        return gun;
    }
}

