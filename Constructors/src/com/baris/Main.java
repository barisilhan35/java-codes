package com.baris;

public class Main {

    public static void main(String[] args) {

        //4. mainin içinde işlemler
        Account bobsAccount = new Account(); //5.new is actually a constructor

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        //8. call the constructor at step 6:

        Account myAccount = new Account("12345",0.00,"baris ilhan", "baris@test.com",
                "54387340");

        // 10. print values on constructor
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerEmailAddress());

        // second part of constructor training:

        Account timsAccount = new Account("tim","tim@gmail.com","" +
                "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());


    }
}
