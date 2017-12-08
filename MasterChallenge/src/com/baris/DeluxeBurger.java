package com.baris;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("deluxe","double meat",
                11.23,"kepekli");
        // add two additions chips and drink:
        // we can put those in the constructor
        super.addHamburgerAddition1("chip",2.1);
        super.addHamburgerAddition2("cola",2.01);

        //override;
    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
       // System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
