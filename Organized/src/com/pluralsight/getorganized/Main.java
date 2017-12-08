package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {
    System.out.println("Hello, Get Organized");
        //local variable
        int myVar;

        myVar= 100;
        System.out.println(myVar);

        int anotherVar = 200;
        System.out.println(anotherVar);

        myVar = anotherVar;
        System.out.println(myVar); //returns 200

        anotherVar = 300;
        System.out.println(anotherVar); //returns 300
        System.out.println("anotherVar: " + anotherVar);

        anotherVar = myVar +10;
        System.out.println(anotherVar); // returns 210
        System.out.println("anotherVar: " + anotherVar);

        char regularU = 'U';
        boolean i= true;
        System.out.println(regularU);

        int prefix = 5;
        System.out.println(++prefix); // returns 6

        int postfix = 5;
        System.out.println(postfix++); //returns 5****
        System.out.println(postfix); //returns 6****

        /*
        math
        */
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        /*
        type conversion
         */
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal= 5;

        short resulta = byteVal;
        short resultb = (short) longVal;

        System.out.println("Success");

        int v1 = 7;
        int v2 = 5;

        int vMax = v1 > v2 ? v1: v2;
        System.out.println(vMax);



    }
}
