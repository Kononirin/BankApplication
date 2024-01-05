package com.ibs.bankapp.domain;

public interface Account {

    public int getAccount();

    public void deposit(double amount);

    public void withdraw(double amount);

    public double getBalance();

    public double maximumAmountToWithdraw();
}
