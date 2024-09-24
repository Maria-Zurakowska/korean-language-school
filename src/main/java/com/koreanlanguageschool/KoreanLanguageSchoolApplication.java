package com.koreanlanguageschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KoreanLanguageSchoolApplication {

    public static void main(String[] args) {
        //SpringApplication.run(KoreanLanguageSchoolApplication.class, args);

        ListBasedCourseOperator listBasedCourseOperator = new ListBasedCourseOperator();

        School school = new School.SchoolBuilder().withClientOperator(new ClientOperator()).build();
        school.printAllClients();

        // create clients
        Client ola = school.createClient("Ola", "Nowak");
        Client kasia = school.createClient("Kasia", "Kowal");
        school.printAllClients();
        System.out.println("-------------");

        // create course
//        Course courseA = listBasedCourseOperator.createCourse("Course A");
//        // register clients for course
//        listBasedCourseOperator.registerClientForCourse(kasia,courseA);
//        listBasedCourseOperator.registerClientForCourse(ola, courseA);
//
//        List<Client> allCourseClients = listBasedCourseOperator.findAllCourseClients(courseA.getCourseName());
//        System.out.println(allCourseClients);
//
////      remove client 'ola'
//        System.out.println("after removing client 'ola' from List<Client> allCourseClients");
//        allCourseClients.remove(ola);
//        List<Client> afterRemove = listBasedCourseOperator.findAllCourseClients(courseA.getCourseName());
//        System.out.println(afterRemove);

//        System.out.println("**");
//        // remove client 'ola' using removeClientFromCourse() method from ListBasedCourseOperator
//        System.out.println("remove client 'ola' using removeClientFromCourse() method from ListBasedCourseOperator");
//
//        listBasedCourseOperator.removeClientFromCourse(courseA.getCourseName(), ola);
//        System.out.println(allCourseClients);

        Teacher teacher = new Teacher.TeacherBuilder().withListBasedCourseOperator(new ListBasedCourseOperator()).build();

        Course courseB = teacher.createCourse("Course B");
        System.out.println(teacher.findCourse(courseB.getCourseName()));

        teacher.registerClientForCourse(kasia, courseB);
        teacher.registerClientForCourse(ola, courseB);
        System.out.println(teacher.findAllCourseClients(courseB.getCourseName()));

        teacher.removeClientFromCourse(courseB.getCourseName(), ola);
        System.out.println(teacher.findAllCourseClients(courseB.getCourseName()));
        teacher.deleteCourse(courseB.getCourseName());
        System.out.println(teacher.findCourse(courseB.getCourseName()));
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
