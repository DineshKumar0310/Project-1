package org.example.Accounts;

public class User {
    private final String name;
    private final String password;

    public User(String username, String password) {
        this.name = username;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


}
