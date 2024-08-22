package com.koreanlanguageschool;

import java.util.List;

public class CourseClientsListService {

    private CourseRepository courseRepository;

    public List<Client> findAllCourseClients(String courseName){

    return courseRepository.findAllCourseClients(courseName);
    }
}
