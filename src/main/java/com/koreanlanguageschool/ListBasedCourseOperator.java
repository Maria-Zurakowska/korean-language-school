package com.koreanlanguageschool;

import java.util.ArrayList;
import java.util.List;

public class ListBasedCourseOperator implements CourseRepository {

  private List<Course> courses = new ArrayList<>();

  @Override
  public Course createCourse(String courseName) {

    Course course = new Course(courseName, new ArrayList<>());
    course.setCourseName(courseName);
    courses.add(course);
    return course;
  }

  @Override
  public Course findCourse(String courseName) {

    return courses.stream()
            .filter(course -> course.getCourseName().equals(courseName))
            .findAny().orElse(null);
  }

  @Override
  public void deleteCourse(String courseName) {

    courses.removeIf(course -> course.getCourseName().equals(courseName));
  }

  @Override
  public void registerClientForCourse(Client client, Course course) {

    if (courses.contains(course)) {
       course.getCourseClients().add(client);
    } else {
      System.out.println("There is no such course");
    }
  }

  @Override
  public void removeClientFromCourse(String courseName, Client client){

    // sprawdz, czy kurs istnieje
    Course selectedCourse = courses.stream()
            .filter(course -> course.getCourseName().equals(courseName))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("Course not found"));

    // sprawdz czy client jest na List<Client>
    // tak - usun
    // nie - nie ma takiego client

    


  }

  @Override
  public List<Client> findAllCourseClients(String courseName) {

    Course courseByName = courses.stream()
            .filter(course -> course.getCourseName().equals(courseName))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("Course not found"));

    List<Client> courseClientsByCourse = courseByName.getCourseClients();

    return courseClientsByCourse;
  }

  @Override
  public void updateCourseClientList(List<Client> courseClients, Course course) {
    Course selectedCourse = findCourse(course.getCourseName());
    if (selectedCourse != null) {
      selectedCourse.setCourseClients(courseClients);
    } else {
      System.out.println("Course not found");
    }
  }
}
