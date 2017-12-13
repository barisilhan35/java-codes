package com.baris;

import java.util.ArrayList;

public class GroceryList {
    // to access array list create it like this:
    private ArrayList<String> groceryList
            = new ArrayList<String>(); //arraylist is also class

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //create function
    public void addGroceryItem(String item) {
        groceryList.add(item); //add element
    }

    // print elements
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size()
                + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }//+1 cuz array starts from 0
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findGroceryItem(currentItem);
        if(position >=0) {
            modifyGroceryItem(position,newItem);
        }

    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) +
                " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if(position >=0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

//    public String findGroceryItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem);
//        /*indexof does searches arraylist and finds
//         the item and  returns the index position of
//         arraylist */
//        int position = groceryList.indexOf(searchItem);
//        if (position>=0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }
        private int findGroceryItem(String searchItem) {
        return  groceryList.indexOf(searchItem);
}


    public boolean onFile(String searchItem) {
        int position = findGroceryItem(searchItem);
        if (position >=0) {
            return true;
        }
        return false;

    }
}
