package com.xworkz.chaining.gun;

public class Soldier {
    public void soldier() {
        System.out.println("create soldier");

        Gun gun = new Gun();
        gun.fire();
        gun.display();
    }


}
