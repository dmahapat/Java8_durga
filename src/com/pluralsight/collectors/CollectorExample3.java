package com.pluralsight.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorExample3 {
    public static void main(String[] args) {
        /*
        * Collecting in a set
        * */

        List<Person> people = Arrays.asList(new Person("Debasish",20),
                new Person("Deepankar",30),
                new Person("Sandeep",40),
                new Person("Debasish",50));

        Set<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println(names);

        /*
        * Collecting in custom collection such as "TreeSet"
        * */
        TreeSet<String> treeSet = people.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Elements collected in a treeset: "+treeSet);

    }
}
