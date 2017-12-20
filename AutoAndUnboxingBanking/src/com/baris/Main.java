package com.baris;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("isbank");
        bank.addBranch("maslak");
        bank.addCustomer("maslak","baris",50.26);
        bank.addCustomer("maslak","abc",150.26);
        bank.addCustomer("maslak","xyz",250.26);

        bank.addBranch("izmir");
        bank.addCustomer("izmir","bob",350.26);

        bank.addCustomerTransaction("maslak","baris",
                44.22);
        bank.addCustomerTransaction("maslak","baris",
                14.22);
        bank.addCustomerTransaction("maslak","abc",
                34.22);

        bank.listCustomers("maslak",true);
        System.out.println("**********");
        bank.listCustomers("maslak",false);
    }
}
