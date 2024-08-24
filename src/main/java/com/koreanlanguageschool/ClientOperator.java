package com.koreanlanguageschool;

import java.util.ArrayList;
import java.util.List;

public class ClientOperator implements ClientRepository {

    private List<Client> clients = new ArrayList<>();

    @Override
    public Client createClient(String name, String lastName) {
        Client client = new Client(name, lastName);
        clients.add(client);
        return client;
    }

    @Override
    public void printAllClients() {

        if (clients != null) {
            clients.forEach(System.out::println);
        } else {
            System.out.println("Argument is null");
        }
    }

    @Override
    public List<Client> findClientsByLastName(String lastName) {

        List<Client> clientsByLastName = new ArrayList<>();

        if (lastName != null) {
            String lastNameFirstLetterUpperCase = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            clientsByLastName = clients.stream()
                    .filter(client -> client.getLastName().equals(lastNameFirstLetterUpperCase))
                    .toList();
        }
        return clientsByLastName;
    }

    @Override
    public void updateClient(Client client, String name, String lastName) {

        if (name != null && lastName != null) {

            List<Client> clientsByLastName = findClientsByLastName(client.getLastName());

            Client selectedClient = clientsByLastName.stream()
                    .filter(clientByLastName -> clientByLastName.getName().equals(client.getName()))
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);

            selectedClient.setName(name);
            selectedClient.setLastName(lastName);
        }
    }

    @Override
    public void deleteClient(Client client) {

    }
}
