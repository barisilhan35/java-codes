package com.baris;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,
                20, 5);
        Case theCase = new Case("2200","ibm",
                "240", dimensions); //dimension yukarıda yaratıldı

        Monitor theMonitor = new Monitor("27inch",
                "Acer",27,
                new Resolution(1920,1080));

        Motherboard themotherboard = new Motherboard("a-223",
                "intel",4,6,"v2");

        PC thePc = new PC(theCase,theMonitor,themotherboard);

       // thePc.getMonitor().drawPixelAt(1500,1200,"red");
        thePc.powerUp();

        //thePc.getMotherboard().loadProgram("windows");

        thePc.getThecase().pressPowerButton();

        System.out.println("end of the first code");

        /*second code bedroom starts*/

        System.out.println("second code bedroom starts in here");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("modern",4,3,2,1);

        Lamp lamp = new Lamp("masa",true,40);

        Bedroom bedroom = new Bedroom("salon",wall1,wall2,wall3,
                wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();



    }
}
