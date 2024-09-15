package com.koreanlanguageschool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
public class Course {

  private String courseName;

  private List<Client> courseClients;

  private Course(CourseBuilder courseBuilder) {
    this.courseName = courseBuilder.courseName;
    this.courseClients = new ArrayList<>(courseBuilder.courseClients);
  }

  public static class CourseBuilder {

    private String courseName;
    private List<Client> courseClients;

    public CourseBuilder withCourseName(String courseName) {
      this.courseName = courseName;
      return this;
    }

    public CourseBuilder withCourseClients(List<Client> courseClients) {
      this.courseClients = courseClients;
      return this;
    }

    public Course build() {
      return new Course(this);
    }
  }

  @Override
  public String toString() {
    return "Course{" +
            "courseName='" + courseName + '\'' +
            ", courseClients=" + courseClients +
            '}';
  }
}
