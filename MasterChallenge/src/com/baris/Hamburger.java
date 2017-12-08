package com.baris;

public class Hamburger {
    // The basic hamburger should have the following items.
    // bread roll type, meat and up to 4 additional additions
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
//up to 4 additional additions:
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    // The constructor should only include the name, roll type, meat and price.

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // we need the add additions:

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    // we need a method to add the prices
    public double totalPriceHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger "
        + " on a " + this.breadRollType + " roll "
        + this.meat + " price is " + this.price);

        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name
                    + " for an extra " + this.addition1Price);

        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name
                    + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name
                    + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name
                    + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}