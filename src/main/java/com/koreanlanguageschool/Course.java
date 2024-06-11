package com.koreanlanguageschool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  private String courseName;

  List<Client> courseClients = new ArrayList<>();
}
