package com.koreanlanguageschool;

import java.util.List;

public class Teacher {

  private ListBasedCourseOperator listBasedCourseOperator;

  public Course createCourse(String courseName){
    return listBasedCourseOperator.createCourse(courseName);
  }

  public Course findCourse(String courseName){
    return listBasedCourseOperator.findCourse(courseName);
  }

  public void deleteCourse(String courseName){
    listBasedCourseOperator.deleteCourse(courseName);
  }

  public void registerClientForCourse(Client client, Course course){
    listBasedCourseOperator.registerClientForCourse(client, course);
  }

  public void removeClientFromCourse(String courseName, Client client){
    listBasedCourseOperator.removeClientFromCourse(courseName, client);
  }

  public List<Client> findAllCourseClients(String courseName){
    return listBasedCourseOperator.findAllCourseClients(courseName);
  }

  public void updateCourseClientList(List<Client> courseClients, Course course){
    listBasedCourseOperator.updateCourseClientList(courseClients, course);
  }
}
