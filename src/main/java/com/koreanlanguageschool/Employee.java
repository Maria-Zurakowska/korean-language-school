package com.koreanlanguageschool;

import java.time.Instant;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
  private String name;
  private String lastName;
  private Instant dateOfEmployment;
}
