package com.pluralsight.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
* 1. JDK provides a factory class "Collectors"
* 2. Collecting data is about gathering data in a mutable container
* 3. A String concatenation
* 4. A collection adding
* 5. A Hashmap (Grouping by a criteria)
* 6. Collector is the interface that models the collector
* 7. Collectors is the factory class that is mostly used to build collectors
* 8. If we cannot collect using the factory class,there are more advanced patterns
* 9.
*
*
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
public class CollectorExample2 {

    public static void main(String[] args) {
        // Collecting a Max

        List<Person> people = Arrays.asList(new Person("Debasish",20),
                new Person("Deepankar",30),
                new Person("Sandeep",40),
                new Person("Anjan",50));

        Integer reduce = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::max);
        System.out.println("Oldest: "+reduce);

        /*
        * The collect method way
        * */
        Optional<Person> optionalPerson = people.stream()
                .collect(
                        Collectors.maxBy(Comparator.comparing(Person::getAge)));

        System.out.println(optionalPerson);

        /*
        * Collect an average
        * */
        Double collect = people.stream()
                .collect(Collectors.averagingInt(Person::getAge));

        System.out.println("Average age is: "+collect);

        /*
        * Collecting in a string of character
        *
        * */

        String names = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Collected name string: "+names);


    }
}
