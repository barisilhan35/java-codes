package com.trk;

public class class1 {

    int z= 0;

    public void addition(int x,int y) {

        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:" + z);
    }

}

class class2 extends class1 {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

}
