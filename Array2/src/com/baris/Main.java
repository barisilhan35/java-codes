package com.baris;

import java.util.Scanner;

public class Main {
//1 scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //2 define array
        int[] myIntegers = getIntegers(5);
        for (int i=0;i<myIntegers.length;i++) {
            System.out.println("element" + i + " typed value was "
             + myIntegers[i]);
        }
        System.out.println("average is :" + getAverage(myIntegers));

    }
//3 create method
    public static int[] getIntegers(int number) {
        System.out.println("enter" + number + "integer vals.\r");
        // \r goes to next line
        //4 define the array:
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] =scanner.nextInt(); //scanner is accept int from console
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum +=array[i];
        }
        return (double) sum / (double) array.length;
    }
}
