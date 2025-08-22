package org.example;


import org.example.Accounts.Login;
import org.example.Accounts.SignUp;
import org.example.Accounts.User;

public class Main {
    public static void main(String[] args) {

        User user = SignUp.signUp();
        Login.logIn(user);
















    }
}