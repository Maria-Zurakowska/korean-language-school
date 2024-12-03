package com.koreanlanguageschool;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientFileOperator implements ClientRepository{

    @Override
    public void printAllClients() {

        List<List<String>> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader("clients.csv"))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        System.out.println(records);
    }

    @Override
    public List<Client> findClientsByLastName(String lastName) {
        return null;
    }

    @Override
    public Client createClient(String name, String lastName) {
        Client client = new Client(name, lastName);

        try (CSVWriter csvWriter = new CSVWriter(new FileWriter("clients.csv"))) {
            csvWriter.writeNext(new String[]{name, lastName});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public void updateClient(Client client, String name, String lastName) {

    }

    @Override
    public void deleteClient(Client client) {

    }
}
