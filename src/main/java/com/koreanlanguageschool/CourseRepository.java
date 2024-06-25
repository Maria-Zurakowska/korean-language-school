package com.koreanlanguageschool;

import java.util.List;

public interface CourseRepository{

  // 2 metody do uzupełnienia

  public List<Client> findAllCourseClients(String courseName);

  public void registerClientForCourse(Client client, Course course);

  public Course createCourse(String courseName);

  public void deleteCourse(String courseName);

  public Course findCourse(String courseName);

  public void updateCourseClientList(List<Client> courseClientList, Course course);
}
