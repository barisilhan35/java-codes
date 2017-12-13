package com.baris;

import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    //****
    private static MobilePhone mobilePhone = new MobilePhone("54321");
    public static void main(String[] args) {
	// write your cod- e here
        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println("\n enter action 1 to 6");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printAction();
                    break;
            }

        }

    }
    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name +
                    ", phone = "+ phone);
        }
        else {
            System.out.println("Cannot add, " + name +
                    " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("enter new contact phone: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhone);
        if (mobilePhone.updateContact(existingContactRecord,newContact)) {
            System.out.println("update success");
        }
        else {
            System.out.println("update fail");
        }
    }

    private static void removeContact() {
        System.out.println("enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("delete success");
        }
        else {
            System.out.println("delete fail");
        }
    }

    private static void queryContact() {
        System.out.println("enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("name: " + existingContactRecord.getName() +
        " phone no is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("phone is starting");
    }

    private static void printAction() {
        System.out.println();
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
