package com.baris;

public class Main { //this is a class main

    public static void main(String[] args) { //this is method main of class main
	// write your code here
        Car porsche = new Car(); // new data type porsche is created type of a car in other words we ve created an
        // object called porsche new keywordu ile initialize etmeliyiz ***** always use new keyword*******
        Car tofas = new Car();

        System.out.println("car model is " + porsche.getModel()); // set etmeden get ettik null dönecek

        porsche.setModel("Boxster");
        System.out.println("car model is " + porsche.getModel());

    }
}
