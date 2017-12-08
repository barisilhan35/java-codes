package com.baris;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmail());

        VipCustomer person2 = new VipCustomer("Bob",25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Baris",100.00,"baris@email.com");
        System.out.println(person3.getEmail() + person3.getName() + person3.getCreditLimit());

    }
}
