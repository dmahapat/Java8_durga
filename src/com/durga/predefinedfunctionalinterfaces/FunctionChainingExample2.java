package com.durga.predefinedfunctionalinterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingExample2 {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String userName = scanner.next();
        System.out.println("Enter Password: ");
        String pwd = scanner.next();
        Function<String,String> getFirst5Chars = s -> s.substring(0,8);
        Function<String,String> getLowerCase = s -> s.toLowerCase();

        if(getFirst5Chars.andThen(getLowerCase).apply(userName).equals("debasish") && pwd.equals("java")){
            System.out.println("Welcome!!! Debasish");
        }else {
            System.err.println("Why are you trying to login?? You bugger!!!");
        }
    }
}
