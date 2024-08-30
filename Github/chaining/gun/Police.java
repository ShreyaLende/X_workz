package com.xworkz.chaining.gun;

public class Police {

        public void useGun(Gun gun) {
            System.out.println("police officer using gun");
            gun.fire();
            gun.display();
        }
    }


