package com.baris;

public class Animal {
    //1 create class and define parameters

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //2 create constructor
    public Animal(String name, int brain, int body,
                  int size, int weight) {

        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

        //System.out.println("log: animal constructor is created and class fields are initialized");

    }

    //6. create method

    public void eat() {

        //12 print
        System.out.println("Animal.eat() is called");

    }

    public void move(int speed) {
        System.out.println("speed of animal is " + speed);

    }

    //2. devam getter setter:

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
