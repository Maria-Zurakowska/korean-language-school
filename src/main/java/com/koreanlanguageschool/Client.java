package com.koreanlanguageschool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {

    private String name;
    private String lastName;
    // String address - TO BE added at a later stage

    private Client(ClientBuilder clientBuilder) {
        this.name = clientBuilder.name;
        this.lastName = clientBuilder.lastName;
    }

    public static class ClientBuilder {

        private String name;
        private String lastName;

        public ClientBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ClientBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Client build() {
            return new Client(this);
        }

    }

    @Override
    public String toString() {
        return "Client{name='" + name + "', lastName='" + lastName + "'}";
    }
}
