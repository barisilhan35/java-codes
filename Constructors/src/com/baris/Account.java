package com.baris;

public class Account { //1. define class and fields
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //6. creating constructor example

    public Account() {

        //11. call constructor within a another constructor
        this("24566", 2.5, "default name", "default address",
                "default phone");

        System.out.println("empty constructor called");
    }

    //6. another constructor

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {

        //9. control construstor is worked at step 8

        System.out.println("Account constructor with parameters is called succesfully");

        // 7. set the field values in the constructor
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress =customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // second part of constructor training

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerEmailAddress);

    }

    // second part seperator

    //3. create two methods
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit amount is " + depositAmount);
        System.out.println("new balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance -withdrawalAmount <= 0) {
            System.out.println(this.balance + " balance is available withdraw not processed");
        }
        else {
            this.balance -= withdrawalAmount;
            System.out.println("withdraw of " + withdrawalAmount + " processed");
            System.out.println("remaining balance is " + this.balance);
        }
    }

    //2. GETTER AND SETTERs are generated below

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
