package com.baris;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //psvm shortcut !!!!
        LinkedList<String> placesToVisit
                = new LinkedList<String>();

        addInOrder(placesToVisit,"izmir");
        addInOrder(placesToVisit,"antalya");
        addInOrder(placesToVisit,"ankara");
        addInOrder(placesToVisit,"istanbul");
        addInOrder(placesToVisit,"bursa");
        addInOrder(placesToVisit,"adana");
        addInOrder(placesToVisit,"gonya");
        addInOrder(placesToVisit,"gotham");


        //placesToVisit.add("izmir");
        //placesToVisit.add("antalya");
        //placesToVisit.add("ankara");
        //placesToVisit.add("istanbul");
        //placesToVisit.add("bursa");
        //placesToVisit.add("adana");
        //placesToVisit.add("gonya");
        //placesToVisit.add("gotham");

        printList(placesToVisit);

        placesToVisit.add(1,"cesme");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String>
                                  linkedList) {
        //ITERATOR!!!!!!
        /*iterator is another way of acceessing
        * and going through all entries that are in
        * a particular array or an arraylist or a
        * linkedlist etc.*/
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println(" now visiting "
            + i.next());
        }
        System.out.println("===================");
    }

    private static boolean addInOrder(LinkedList<String>
                                      linkedList,
                                      String newCity) {
        ListIterator<String> stringListIterator =
                linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison =stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included" +
                        "as a destination");
                return false;
            } else if (comparison>0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison<0) {
                //move on next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit= false;
        boolean goingForward = true;
        ListIterator<String> listIterator
                = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("no cities");
            return;
        }
        else {
            System.out.println("now visitin " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now visitin " + listIterator.next());
                    }
                    else {
                        System.out.println("end of list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now visitin " + listIterator.previous());
                    }
                    else {
                        System.out.println("start of list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }

    }
    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
