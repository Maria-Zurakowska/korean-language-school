package com.koreanlanguageschool;

import java.util.List;

public interface ClientRepository {

    public void printAllClients();

    public List<Client> findClientsByLastName(String lastName);

    public Client createClient(String name, String lastName);

    public void updateClient(Client client, String name, String lastName);

    public void deleteClient(Client client);

}
