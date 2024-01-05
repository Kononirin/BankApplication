package com.ibs.bankapp.domain;

public abstract class AbstractAccount implements Account {

    private int id;
    private double balance;

    public int getAccount() {
        return id;
    }

    public AbstractAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
