package com.xworkz.chaining.gun;

public class Gun {
    private String name="AK-47";
    private String countryMade="Russia";
    private String type="Assault Rifle";

    public void fire() {
        System.out.println(name + " is firing!");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Country Made: " + countryMade);
        System.out.println("Type: " + type);
    }
}






