package com.durga.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

public class PredicateFilterNameStartsWithK {
    static public void main(String[] args){
        String[] names = {"Sunny",
        "Kajal",
        "Mallika",
        "Katrina",
        "Kareena"};

        Predicate<String> isStartingWithK = s -> s.charAt(0) == 'K';
        System.out.println("Names starting with \"K\" ");
        for (String name : names) {
            if(isStartingWithK.test(name)){
                System.out.println(name);
            }
        }

    }
}
