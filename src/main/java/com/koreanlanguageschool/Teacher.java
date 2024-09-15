package com.koreanlanguageschool;

import java.time.LocalDate;
import java.util.List;

public class Teacher {

  private String name;
  private String lastName;
  private LocalDate dateOfEmployment;
  // String address - TO BE added at a later stage
  private ListBasedCourseOperator listBasedCourseOperator;

  private Teacher(TeacherBuilder teacherBuilder) {
    this.name = teacherBuilder.name;
    this.lastName = teacherBuilder.lastName;
    this.dateOfEmployment = teacherBuilder.dateOfEmployment;
    this.listBasedCourseOperator = teacherBuilder.listBasedCourseOperator;
  }

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

  public static class TeacherBuilder {

    private String name;
    private String lastName;
    private LocalDate dateOfEmployment;
    private ListBasedCourseOperator listBasedCourseOperator;

    public TeacherBuilder withName(String name){
      this.name = name;
      return this;
    }

    public TeacherBuilder withLastName(String lastName){
      this.lastName = lastName;
      return this;
    }

    public TeacherBuilder withDateOfEmployment(LocalDate dateOfEmployment){
      this.dateOfEmployment = dateOfEmployment;
      return this;
    }

    public TeacherBuilder withListBasedCourseOperator(ListBasedCourseOperator listBasedCourseOperator){
      this.listBasedCourseOperator = listBasedCourseOperator;
      return this;
    }

    public Teacher build(){
      return new Teacher(this);
    }
  }
}
