package com.ibs.bankapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;

    private Gender gender;

    public String getName() {
        return name;
    }

    private List<Account> accounts = new ArrayList<>();

    public Client(String name, Gender gender) {

        this.name = name;
        this.gender = gender;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void getClientGreeting() {
        if (gender != null) {
            System.out.println(gender.getGreeting() + " " + name);
        } else {
            System.out.println(name);
        }
    }
}
