package com.example.practice.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String username;
    String password;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }
}

public class UserAuthenticationByUsingPredicate {
    public static void main(String[] args) {
        Predicate<User> userPredicate = user -> user.username.equals("admin") && user.password.equals("password");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = scanner.next();
        System.out.println("Enter password : ");
        String password = scanner.next();
        User user = new User(username, password);

        if (userPredicate.test(user)){
            System.out.println("Valid User");
        } else {
            System.out.println("Invalid User please login again !!!");
        }
    }
}
