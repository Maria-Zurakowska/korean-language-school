package com.koreanlanguageschool;

import java.time.LocalDate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {

    private String name;
    private String lastName;
    private LocalDate dateOfEmployment;
}
