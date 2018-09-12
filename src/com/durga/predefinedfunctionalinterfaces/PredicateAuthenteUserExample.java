package com.durga.predefinedfunctionalinterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateAuthenteUserExample {

    static public void main(String[] args) {

        Predicate<User> isValidUser = user -> {
            return (user.userName.equalsIgnoreCase("debasish")
                    && user.password.equalsIgnoreCase("java"));
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name: ");
        String userName = scanner.next();
        System.out.println("Please enter password: ");
        String password = scanner.next();
        User user = new User(userName,password);
        if(isValidUser.test(user)){
            System.out.println("Hi Debasish!!! Welcome");
        }else{
            System.err.println("Invalid User...Please log in again");
        }
    }
}

