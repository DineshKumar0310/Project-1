package org.example.Accounts;
import java.util.Scanner;
public class SignUp {

    public static User signUp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create user");
        String username = sc.next();
        System.out.println("Create password");
        String password = sc.next();
        return new User(username , password);
    }
}
