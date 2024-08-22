package com.koreanlanguageschool;

import java.util.List;

public class Teacher {

  private ListBasedCourseOperator listBasedCourseOperator;

  //edytuj liste uczniow na kursie
  public Course updateCourseClientList(String courseName, List<Client> clientList){
    return new Course(courseName, clientList);
  }
// pokaz wszystkich uczniow na kursie
  public Course getCourseClientList(){
    return null;
  }

// zapisz ucznia na kurs
  public void saveCourseClient(Client client){

  }
// usun ucznia z kursu
  public void removeCourseClient(Client client){

  }
}

