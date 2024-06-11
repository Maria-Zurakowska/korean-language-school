package com.koreanlanguageschool;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {

    private String name;
    private String lastName;

  // String address do zmiany

    @Override
    public String toString() {
        return "Client{name='" + name + "', lastName='" + lastName + "'}";
    }
}
