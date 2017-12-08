package com.baris;

public class Main {

    public static void main(String[] args) {
	// how to define array?:
       // int myVariable = 50; normal integer
        int[] myVariable;
        myVariable = new int[10];
        // or
        int[] myVarible2 = new int[11];
        //or
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //or
        //int[] myIntArray = new int[10];//10luk array 0 to 9
        //or
        int[] myIntArray = new int[10];
        for (int i=0; i<10; i++) {
            myIntArray[i]=i*10;
            System.out.println(myIntArray[i]);
        }
        for (int i=0; i<10; i++) {
            System.out.println("element " + i + ". value is "
            + myIntArray[i]);
        }


        //how to access:
        //saving value 50 into element 6.
        // all array starts with 0
        //myIntArray[5] = 50;
        //myIntArray[0] = 45;
        //myIntArray[1] = 400;
        //double[] myDoubleArray = new double[10];
        //System.out.println(myIntArray[0]);
        //System.out.println(myIntArray[6]);
        //System.out.println(myIntArray[8]);

        /* üst ile sonuç aynı ama length kullanılıyor better than hard coding*/
        for (int i=0; i<myIntArray.length; i++) {
            myIntArray[i]=i*5;
            System.out.println(myIntArray[i]);
        }
        for (int i=0; i<myIntArray.length; i++) {
            System.out.println("element " + i + ". value is "
                    + myIntArray[i]);
        }

        // call the method:
        printArray(myIntArray);

    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("elemento " + i + ". valuu is "
                    + array[i]);
        }

    }
}
