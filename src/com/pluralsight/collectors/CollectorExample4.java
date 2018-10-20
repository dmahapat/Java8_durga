package com.pluralsight.collectors;

import java.util.*;
import java.util.stream.Collectors;

/*
* Collecting in a Map
*
* */
public class CollectorExample4 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Debasish",20),
                new Person("Deepankar",20),
                new Person("Sandeep",50),
                new Person("Anjan",50));
        /*
        * Collecting the above List in a Map using Collectors.partitioningBy
        * 1. the key of this map is boolean - so we have only 2 key types - true and false
        * 2. this is a special kind of Map
        * */
        Map<Boolean, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.partitioningBy(person -> person.age > 21));

        System.out.println("People By Age: "+peopleByAge);

        /*
        * Basic Grouping: this is bit more complicated
        *
        *
        * */

        Map<Integer, List<Person>> peopleByAGEGroup = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("peopleByAGEGroup : "+peopleByAGEGroup);

        /*
        * How many people in each age group
        *
        * in the below constructed map key -> age, value -> number of people in that age group
        *
        * */
/*
        people.stream()
              .collect(Collectors.groupingBy(Person::getAge),Collectors.counting());*/

        /*people.stream()
              .collect(Collectors.groupingBy(Person::getAge),
                      Collectors.mapping(p ->p.getName()))*/

        /*people.stream()
              .collect(
                      Collectors.groupingBy(Person::getAge),
                      Collectors.mapping(
                              t -> t.getName(),
                              Collectors.toCollection(TreeSet::new)
                      )
              );*/

        /*
        * Collecting in an immutable map
        *
        * */
        Map<Integer, List<Person>> collectUnModifiable = people.stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(Person::getAge),
                                Collections::unmodifiableMap
                        )
                );
        System.out.println("Collected in unmodfiable map: "+collectUnModifiable);

    }
}
