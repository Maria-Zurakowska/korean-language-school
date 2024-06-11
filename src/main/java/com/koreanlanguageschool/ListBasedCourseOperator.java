package com.koreanlanguageschool;

import java.util.ArrayList;
import java.util.List;

public class ListBasedCourseOperator implements CourseRepository {

  private List<Course> courses = new ArrayList<>();

  @Override
  public List<Client> findAllCourseClients(String courseName) {

    Course courseByName = courses.stream()
            .filter(course -> course.getCourseName().equals(courseName))
            .findAny()
            .get();

    List<Client> courseClientsByCourse = courseByName.getCourseClients();

    return courseClientsByCourse;
  }

  @Override
  public void registerClientForCourse(Client client, Course course) {

  }

  @Override
  public void updateCourseClientList(List<Client> courseClients, Course course) {

  }

  @Override
  public Course createCourse(String courseName) {

    Course course = new Course();
    course.setCourseName(courseName);
    courses.add(course);
    return course;
  }

  @Override
  public void deleteCourse(String courseName) {

  }

  @Override
  public String findCourse(String courseName) {
    return "";
  }
}
