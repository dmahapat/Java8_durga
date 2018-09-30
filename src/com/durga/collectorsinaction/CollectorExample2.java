package com.durga.collectorsinaction;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorExample2 {

    static public void main(String... args) {
        List<Person> people = Arrays.asList(new Person("Roshni", 30),
                new Person("Debasish", 30),
                new Person("Deepankar", 123));

        Set<String> names =
                people.stream()
                      .map(Person::getName)
                      .collect(Collectors.toSet());

        System.out.println(names);

        //Collecting in a custom collection

        TreeSet<String> strings =
                people.stream()
                      .map(Person::getName)
                      .collect(Collectors.toCollection(() -> new TreeSet<>()));

        System.out.println("Collected in a treeset: "+ strings);

        //Collecting in a map

        Map<Boolean,List<Person>> peopleByAge =
                people.stream()
                      .collect(Collectors.partitioningBy(o -> o.getAge() > 21));

        System.out.println("The map: "+peopleByAge);

        Map<Integer,List<Person>> integerListMap =
                people.stream()
                      .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("Grouped by age: "+integerListMap);
    }
}
