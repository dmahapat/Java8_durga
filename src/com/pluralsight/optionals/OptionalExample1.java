package com.pluralsight.optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
* Optionals:
* 1. Special type of stream, which holds 1 or 0 elements
* 2. Some times operations might not have any result
*
*
*
* */
class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class OptionalExample1 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(new Human("Debasish",20),
                new Human("Deepankar",30),
                new Human("Sandeep",40),
                new Human("Anjan",50));

        int maxAge = humans.stream()
                .map(Human::getAge)
                .reduce(0,Integer::max);

        // Above the first argument to reduce method is the identity element of integers
        // Because all the elements in the streams are positive integers
        System.out.println("Max age is: "+maxAge);
        // Let's calculate the average of all ages
        OptionalDouble average = humans.stream()
                .mapToInt(Human::getAge)
                .average();
        // average has no identity element.
        // what should be the value if we calculate average on empty stream of elements.
        // that is the reason the result is wrapped in a OptionalDouble
        // This optional average can be empty
        System.out.println("Avearge is : "+average.getAsDouble());


    }
}
