package com.koreanlanguageschool;

import java.util.ArrayList;
import java.util.List;

public class ClientOperator implements ClientRepository{

    private List<Client> clients = new ArrayList<>();

    @Override
    public Client createClient(String name, String lastName) {
        Client client = new Client(name, lastName);
        clients.add(client);
        return client;
    }

    @Override
    public List<Client> findAllClients() {
        return null;
    }

    @Override
    public Client findClientByLastName(String lastName) {
        return null;
    }



    @Override
    public void updateClient(Client client) {

    }

    @Override
    public void deleteClient(Client client) {

    }
}
