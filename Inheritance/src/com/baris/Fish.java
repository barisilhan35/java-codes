package com.baris;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    //this is constructor:
    public Fish(String name, int brain, int body, int size,
                int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void move() {

    }

    private void dive () {

    }


    private void swim(int speed) {
        move();
        dive();
        super.move(speed); //animal class super class

    }
}
