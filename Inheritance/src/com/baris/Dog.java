package com.baris;
// 3. create child class inherit from base class
public class Dog extends Animal { // extends inheritance için kullanilir

    //5. fields of dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // must call constructor of other class:
    //4. generate other constructor:

    // 7. comment below:
    //public Dog(String name, int brain, int body, int size, int weight) {
      //  super(name, brain, body, size, weight);
        /* keyword super means super class call the class that is
        extending from. (initialize ) */

    //}
    // 8 constructorı düzenle
    public Dog(String name,  int size, int weight,
               int eyes, int legs, int tail, int teeth,
               String coat) {
        super(name, 1, 1, size, weight);
        // 9 initialize other fields:
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //13 create private method for dog
    private void chew() {
        System.out.println("Dog.chew() is called" +
                "");
    }

    //14 override: Animal classiındaki eat methodu dog da kullanmak:
    // both animal and dog classes has got its eat method now

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat(); //calls animal.eat
    }

    public void walk() {
        System.out.println("dog.walk is called");
        super.move(5);
    }

    public void run() {
        System.out.println("dog.run is called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("dog.moveleg is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move is called");
        moveLegs(speed);
        super.move(speed);
    }
}
