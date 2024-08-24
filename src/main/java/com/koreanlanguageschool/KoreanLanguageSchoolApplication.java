package com.koreanlanguageschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KoreanLanguageSchoolApplication {

    public static void main(String[] args) {
        //SpringApplication.run(KoreanLanguageSchoolApplication.class, args);

        //getCourseClients();
        ClientOperator clientOperator = new ClientOperator();

        Client wiola = clientOperator.createClient("Wiola", "Baran");
        Client ola = clientOperator.createClient("Ola", "Nowak");
        Client kasia = clientOperator.createClient("Kasia", "Baran");

        clientOperator.printAllClients();

        System.out.println(clientOperator.findClientsByLastName("baran"));

        System.out.println("-------------");

        clientOperator.updateClient(wiola, "Iza", "Krzak");
        clientOperator.printAllClients();

        clientOperator.updateClient(new Client("Magda", "Baran"), "Iza", "Krzak");
        clientOperator.printAllClients();
    }

    private static void getCourseClients() {
        ListBasedCourseOperator lbo = new ListBasedCourseOperator();
        List<Client> clients = new ArrayList<>();

        Client client1 = new Client("Anna", "Makowska");
        Client client2 = new Client("Kasia", "Nowak");
        Client client3 = new Client("Ola", "Kowalska");

        clients.add(client1);
        clients.add(client3);

        Course course1 = lbo.createCourse("course1");
        course1.setCourseClients(clients);

        List<Client> clientsByCourse = lbo.findAllCourseClients(course1.getCourseName());

        System.out.println(clientsByCourse);
    }
}
