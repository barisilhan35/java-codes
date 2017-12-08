package com.baris;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    //create constructor:
    public Car(String name, String size, int wheels,
               int doors, int gear, boolean isManual) {
        super(name, size); // initialize from vehicle
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    //create getter ve setter for currenGear
    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) { //changegear da diyebilirz
        this.currentGear = currentGear;
        System.out.println("car.setcurrentgear()is changed to "
         + this.currentGear + " gear. ");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("car.changeVelocity : Velocity "
        + speed +"direction " + direction);
    }

}
