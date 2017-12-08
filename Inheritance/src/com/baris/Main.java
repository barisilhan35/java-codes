package com.baris;

public class Main {

    public static void main(String[] args) {

        //10 create an animal
        Animal animal = new Animal("Animal",1,1,
                5,5);

        System.out.println(animal.getName() + " name of the first animal");

        //11 create a dog:

        Dog dog = new Dog("putty",8,20,2,
                4,1,20,"long");

        System.out.println("name of the dog is " + dog.getName());

        //12 call method from animal class
        dog.eat();
        dog.walk();
        dog.run();
    }
}
