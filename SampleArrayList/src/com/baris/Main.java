package com.baris;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
        ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
        obj.add("Sally");
        obj.add("Harry");
        obj.add("Gary");
        obj.add("Steve");
        obj.add("Johnny");

	  /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:"
                +obj);

	  /*Add element at the given index*/
        obj.add(0, "Barry");
        obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
        obj.remove("Steve");
        obj.remove("Harry");

        System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
        obj.remove(1);

        System.out.println("Now array list is:"+obj);

        obj.set(2,"Tom");
        System.out.println("Last array list is:"+obj);
        System.out.println("size of array is " + obj.size());

        int indx = obj.indexOf("Tom");
        System.out.println("index of given name is " + indx);

        int numberofitems = obj.size();
        System.out.println("numberofitems array is " + numberofitems);


    }
}
