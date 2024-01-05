package com.ibs.main;

import com.ibs.bankapp.domain.*;
import com.ibs.bankapp.service.BankService;

import java.util.List;

import static com.ibs.bankapp.domain.Gender.FEMALE;
import static com.ibs.bankapp.domain.Gender.MALE;

public class BankApplication {

    static Bank bank;

    public static void main(String[] args) {

        bank = new Bank();

        Account account1 = new SavingAccount(11, 11000.00);
        Account account11 = new CheckingAccount(111, 1000, 500);
        Client client1 = new Client("Ann", FEMALE);
        client1.addAccount(account1);
        client1.addAccount(account11);


        Account account2 = new SavingAccount(22, 22000.00);
        Account account22 = new CheckingAccount(222, 2000, 200);
        Client client2 = new Client("Oleg", MALE);
        client2.addAccount(account2);
        client2.addAccount(account22);

        BankService.addClient(bank, client1);
        BankService.addClient(bank, client2);

        modifyBank();
        printBalance();
        client1.getClientGreeting();
        client2.getClientGreeting();

        BankService.printMaximumAmountToWithdraw(bank);

    }

    public static void modifyBank() {
        Client cl1 = bank.getClients().get(0);
        Account acc1 = cl1.getAccounts().get(0);
        acc1.deposit(1000.00);

        Client cl2 = bank.getClients().get(1);
        Account acc2 = cl2.getAccounts().get(0);
        acc2.withdraw(2000);
    }

    public static void printBalance() {
        List<Client> cls = bank.getClients();

        for(Client cl : cls) {
            System.out.println(cl.getAccounts().get(0).getBalance());
        }
    }
}