package com.trk;

public class Account {

    private String name;
    private long amount;

    public Account(String name, long amount) {
        this.name = name;
        this.amount = amount;
        setAmount(amount);
    }

    void deposit(long amount) {
        this.amount += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(long amount) {
        super("savings", amount);
    }
}

class CheckingAccount extends Account {

    public CheckingAccount(long amount) {
        super("checking", amount);
    }

    void withdraw(long amount)
    {
        setAmount(getAmount()-amount);
    }
}
