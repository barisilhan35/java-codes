package com.baris;

public class Contact {

    private String name;
    private String phoneNumber;

    // 1 create constructor:

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //2 getters:

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //3 create e method to create new contact
    // calling constructor to create contact
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
