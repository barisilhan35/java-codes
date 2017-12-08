package com.baris;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    /*!!!!!!! cons 3 and 2 calls 1!!!!!!!*/

    // constructor 3
    public VipCustomer() {
        this("Default name", 50000.00,"default@email.com");
    }

    // constructor 2
    public VipCustomer(String name, double creditLimit) {
        //this.name = name;
        //this.creditLimit = creditLimit;
        this(name,creditLimit,"test@email.com");
    }

    // constructor 1
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
