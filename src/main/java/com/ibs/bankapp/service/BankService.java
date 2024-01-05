package com.ibs.bankapp.service;

import com.ibs.bankapp.domain.Account;
import com.ibs.bankapp.domain.Bank;
import com.ibs.bankapp.domain.Client;
import com.ibs.bankapp.domain.SavingAccount;

public class BankService{

    public static void addClient(Bank bank, Client client) {
        bank.addClient(client);
    }

    public static void printMaximumAmountToWithdraw(Bank bank) {
        for (Client cl : bank.getClients()) {
            for(Account acc : cl.getAccounts()) {
                System.out.println(acc.maximumAmountToWithdraw());
                System.out.printf("Client %s - account %d - max amount %f\n",
                        cl.getName(), acc.getAccount(), acc.maximumAmountToWithdraw());
            }
        }
    }
}
