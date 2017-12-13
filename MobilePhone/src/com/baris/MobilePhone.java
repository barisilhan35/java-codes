package com.baris;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

// 4 create constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        /* 5 initialize arraylist.when you have arraylist
        that using a class init it in constructor*/
        this.myContacts = new ArrayList<Contact>();
    }
    // When adding or updating be sure to check if the contact already exists (use name)
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName())>=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        else
            myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
// returns int showing element position of contact object in the array
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    //Overload findcontact:
    //
    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " deleted");
        return true;
    }

    public void printContacts() {
        System.out.println("contact list");
        for (int i=0; i<this.myContacts.size();i++) {
            System.out.println((i+1) + "." +
            this.myContacts.get(i).getName() + " ->" +
            this.myContacts.get(i).getPhoneNumber());
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }
        return null;
    }
}
