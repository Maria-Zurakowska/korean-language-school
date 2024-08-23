package com.koreanlanguageschool;

public class School {
  private String name;
  // String address do zmiany
  private Employee employee;
  public Client getCourseClient;

  private ClientOperator clientOperator;

  public Client createClient(String name, String lastName){

    return clientOperator.createClient(name, lastName);
  }


}
