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
    public void printAllClients() {

        if(clients != null) {
            clients.forEach(System.out:: println);
        } else {
            System.out.println("Argument is null");
        }
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
