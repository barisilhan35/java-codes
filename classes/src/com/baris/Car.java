package com.baris;

public class Car {
// define fields;
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    /*SETTER method creation:*/

    public void setModel(String model) { // iki tane model tanımlandı hangisi oldugunu ayırmalıyız this ile
            // classtaki modele refer ediyoruz

        // yeni bir parametre ekleyip validation yapalım

        String validModel = model.toLowerCase();
        if (validModel.equals("boxster") || validModel.equals("sahin")) {
            //.equals kullanımı test of value String equal to another type
            this.model = model;
        }
        else {
            this.model="Unknown";
        }
        //this.model = model; // ilk model field ikinci parameter
    }

    /*GETTER method creation:*/

    public String getModel() { //get edince main de ekrana basabiliriz
        return this.model;
    }
}
