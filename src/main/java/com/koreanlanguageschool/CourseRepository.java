package com.koreanlanguageschool;

import java.util.List;

public interface CourseRepository{



  // 2 metody do uzupełnienia

  public List<Client> findAllCourseClients(String courseName);

  public void registerClientForCourse(Client client, Course course);


}
