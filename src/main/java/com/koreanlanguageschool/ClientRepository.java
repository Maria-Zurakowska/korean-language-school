package com.koreanlanguageschool;

import java.util.List;

public interface ClientRepository {

    public List<Client> findAllClients();

    public Client findClientByLastName(String lastName);

    public Client createClient(String name, String lastName);

    public void updateClient(Client client);

    public void deleteClient(Client client);

}
