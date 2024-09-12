package com.koreanlanguageschool;

import java.util.List;

public class Teacher {

  private ListBasedCourseOperator listBasedCourseOperator;

  public void updateCourseClientList(List<Client> courseClients, Course course){
    listBasedCourseOperator.updateCourseClientList(courseClients, course);
  }

  public List<Client> findAllCourseClients(String courseName){
    return listBasedCourseOperator.findAllCourseClients(courseName);
  }

  public void registerClientForCourse(Client client, Course course){
    listBasedCourseOperator.registerClientForCourse(client, course);

  }
// usun ucznia z kursu // nie mam w course repository
  public void removeCourseClient(Client client){

  }
}

