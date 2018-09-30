package com.durga.collectorsinaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Collector is an interface that models the collectors
 * Collectors is the factory class to build collectors
 *  - Most collectors can be built through factory
 *  - otherwise we have different patterns
 * */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CollectorExample1 {

    static public void main(String... args) {

        List<Person> people = Arrays.asList(new Person("Roshni", 30),
                new Person("Debasish", 12),
                new Person("Deepankar", 123));

        Optional<Person> oldest = people.stream()
                .collect(
                        Collectors.maxBy(Comparator.comparing(Person::getAge))
                );

        System.out.println("The oldest in the group is:" + oldest);

        double average = people.stream()
                .collect(
                        Collectors.averagingDouble(Person::getAge)
                );

        System.out.println("Average of group is: "+average);

        String names = people.stream()
                            .map(Person::getName)
                            .collect(
                              Collectors.joining(", ")
                            );
        System.out.println("Every one in the group: "+names);
    }
}
