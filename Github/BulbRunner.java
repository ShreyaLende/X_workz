package com.xworkz.Inheritance.things;
import com.xworkz.Inheritance.things.Bulb;
import com.xworkz.Inheritance.things.LED;
import com.xworkz.Inheritance.things.Halwa;

public class BulbRunner {
    public static void main(String[] args) {

        Bulb bulb1 = new Bulb();
        bulb1.color();
        bulb1.color="blue";

        System.out.println("Bulb details:"+bulb1.color);

        Bulb led1 = new LED();
        led1.color();
        System.out.println("LED details:"+led1.color);

        Halwa halwa1 = new Halwa();
        halwa1.flaver();
        halwa1.cost();
        halwa1.flaver="sweet";
        halwa1.cost=50;
        System.out.println("Halwa flaver:"+halwa1.flaver);
        System.out.println("Halwa cost:"+halwa1.cost);

        Halwa specialHalwa1 = new SpecialHalwa();
        specialHalwa1.flaver();
        specialHalwa1.cost();
        System.out.println("Halwa flaver:"+specialHalwa1.flaver);
        System.out.println("Halwa cost:"+specialHalwa1.cost);

        System.out.println("////////////////////////////");

       Device device1 = new Device();
        device1.cost();
        device1.cost=15000;
        device1.brand();
        device1.brand="redmi";
        System.out.println("device cost:"+device1.cost);
        System.out.println("device brand:"+device1.brand);

        Device smartphone = new SmartPhone();
        smartphone.cost();
        smartphone.brand();
        System.out.println("device cost:"+smartphone.cost);
        System.out.println("device brand:"+smartphone.brand);

        System.out.println("////////////////////////////");

       Animal animal = new Animal();
animal.breed();
animal.color();
animal.isDomesticated();
animal.weight();
animal.hornLength();
        System.out.println("Animal:"+animal.breed);
        System.out.println("Animal:"+animal.weight);
        System.out.println("Animal:"+animal.hornLength);
        System.out.println("Animal:"+animal.isDomesticated);
        System.out.println("Animal:"+animal.color);

        Animal bull = new Bull();
        bull.color();
        bull.isDomesticated();
        bull.hornLength();
        bull.weight();
        bull.breed();
        System.out.println("Animal:"+bull.breed);
        System.out.println("Animal:"+bull.weight);
        System.out.println("Animal:"+bull.hornLength);
        System.out.println("Animal:"+bull.isDomesticated);
        System.out.println("Animal:"+bull.color);

        System.out.println("////////////////////////////");
       Bird bird = new Bird();
       bird.age();
       bird.color();
       bird.breed();
       bird.weight();
       bird.isMale();
        System.out.println("bird:"+bird.color);
        System.out.println("bird:"+bird.weight);
        System.out.println("bird:"+bird.isMale);
        System.out.println("bird:"+bird.age);
        System.out.println("bird:"+bird.breed);

        Bird chiken = new Chicken();
        chiken.age();
        chiken.color();
        chiken.breed();
        chiken.weight();
        chiken.isMale();
        System.out.println("bird:"+chiken.color);
        System.out.println("bird:"+chiken.weight);
        System.out.println("bird:"+chiken.isMale);
        System.out.println("bird:"+chiken.age);
        System.out.println("bird:"+chiken.breed);
    }
}











