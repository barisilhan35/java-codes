package com.baris;
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
// Constructor should initialize cylinders (number of) and name, and set wheels to 4

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4;
        this.engine = true;
    }
    // Create appropriate getters

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> break";
    }
}

// Now create 3 sub classes for your favorite vehicles.

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }
}

 class Bmw extends Car {

    public Bmw(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +
                " "+ "Bmw -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Bmw -> accelerate";
    }

    @Override
    public String brake() {
        return getCylinders() + "Bmw -> brake"; //deneme
    }
}

 class Fiat extends Car {

    public Fiat(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Fiat -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Fiat -> accelerate";
    }

    @Override
    public String brake() {
        return "Fiat -> brake";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car =new Car(8,"carr");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford fort = new Ford(6,"focus");
        System.out.println(fort.startEngine() + " " + fort.getName());
        System.out.println(fort.accelerate());
        System.out.println(fort.brake());

        Fiat fiat = new Fiat(6,"linea");
        System.out.println(fiat.startEngine() + " " + fiat.getName());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());

        Bmw bmw = new Bmw(8,"640");
        System.out.println(bmw.startEngine() + " " + bmw.getName());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

    }

}
