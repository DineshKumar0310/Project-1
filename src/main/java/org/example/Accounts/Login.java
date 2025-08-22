package org.example.Accounts;
import java.util.Scanner;
public class Login {



    public static  void logIn(User signUp){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String username = sc.next();


        System.out.println("Enter password");
        String password = sc.next();

        if(username.equals(signUp.getName()) && password.equals(signUp.getPassword())){
            System.out.println("Login successful !");

        }
        else {
            System.out.println("Failed to login !");
        }

    }
}
