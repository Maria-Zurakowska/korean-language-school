package com.koreanlanguageschool;

import java.util.List;

public class ListBasedCourseRepository implements CourseRepository {
  private List<Course> courses;

  @Override
  public List<Client> findAllCourseClients(String courseName) {
    return null;
  }

  @Override
  public void registerClientForCourse(Client client, Course course) {

  }
}
