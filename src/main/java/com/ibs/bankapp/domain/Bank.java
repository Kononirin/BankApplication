package com.ibs.bankapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients = new ArrayList<Client>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {

        return clients;
    }
}
