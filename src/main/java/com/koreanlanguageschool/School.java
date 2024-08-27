package com.koreanlanguageschool;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class School {

    private String name;
    private Employee employee;
    // String address - TO BE added at a later stage
    private ClientOperator clientOperator;

    public Client createClient(String name, String lastName) {

        return clientOperator.createClient(name, lastName);
    }

    public void printAllClients() {

        clientOperator.printAllClients();
    }

    public List<Client> findClientsByLastName(String lastName) {

        return clientOperator.findClientsByLastName(lastName);
    }

    public void updateClient(Client client, String name, String lastName) {

        clientOperator.updateClient(client, name, lastName);
    }

    public void deleteClient(Client client) {

        clientOperator.deleteClient(client);
    }
}
