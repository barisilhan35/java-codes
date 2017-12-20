package com.baris;

import java.util.ArrayList;

class Intclass {
    private int myValue;

    public Intclass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList =
                new ArrayList<String>();

        stringArrayList.add("Baris");

       // ArrayList<int> intArrayList =
         //       new ArrayList<int>(); // int hata verir yukarıya class tanımlıyoruz
        ArrayList<Intclass> intclassArrayList =
                new ArrayList<Intclass>();
        intclassArrayList.add(new Intclass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList =
                new ArrayList<Integer>();
        for (int i=0;i<=10;i++) { //autoboxing
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++) { //unboxing
            System.out.println(i + " --> " +
            integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // = Integer.valueOf(56)
        int myInt = myIntValue; // = myIntValue.intValue();


    }
}
