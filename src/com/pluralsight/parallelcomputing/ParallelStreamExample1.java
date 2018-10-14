package com.pluralsight.parallelcomputing;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Advantage of parallel processing
* 1. To allow faster computation
* 2. To leverage multicore
* 3. Multithread != parallel
* MultiThread - (each data processing happens in the same thread)
* Parallel Processing - each data processing happens with multiple threads
*
* Suppose we are trying to sort an array
*  a. in multithreaded environment one thread will perform the sorting
*  b. in parallel environment multiple thread will perform the sorting
*
*  Multithread : 1 process 1 thread
*   Problems in multithreaded environment:
*       a. race conditions
*       b. thread synchronization
*       c. variable visibility
*  Parallel Processing : one process many thread - to go faster
*   Problems:
*       a. algorithm
*       b. data distribution
*       c. CPU load
*   Solution:
*
*       1. Upto java 6 there was no tool to handle parallel processing
*       2. Java 7 has fork and join framework - very difficult framework - cannot be used efficiently
*       3. 3rd party API : parallel APIs - java 6 compatible
*       4. Java 8 - parallel stream - extremely simple to use
*
*  list.parallelStream() or list.stream().parallel - no guarantee of order - call sorted() for specific order
*
*  Caveat - warning:
*
*  1. most of the cases it works
*  2. but some cases it has to be avoided
*  3. we should not have synchronization and visibility issues
*  4. Stateful streams will not be efficiently computed in parallel way
*  5. Stateless operation :
*      .filter(person -> person.getAge()>20) - to evaluate this we do not need anything else than person object
*      this is sneaky stateful. to make it stateless
*      we have to do
*      .unordered()
*      .filter(...)
*
*
*  6. Stateful operation :
*      .skip(2)
*      .limit(5)
*      - because we need to know the element is 1st or 2nd or 3rd
*
*  How to distinguish stateful vs stateless
*   -written in javadoc
*
*  Parallel Reductions:
*  1. use collectors instead of reduce()
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
}
public class ParallelStreamExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Debasish",20),
                new Person("Deepankar",30),
                new Person("Sandeep",40),
                new Person("Anjan",50));

        //Below we are setting the number of threads to 2 - if we do not then many threads will work on the below logic
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","2");

        //List<String> strings = new ArrayList<>();
        //List<String> strings = Collections.synchronizedList(new ArrayList<>());
        List<String> strings = new CopyOnWriteArrayList<>();

        Stream.iterate("+",s -> s + "+")
                .parallel() //- order will not be maintained upon uncommenting it
                .limit(1000)
                //.peek(s -> System.out.println(s+" processed in the thread " +Thread.currentThread().getName()))
                .forEach(s -> strings.add(s));
        System.out.println("strings #" + strings.size());


        List<String> collect = Stream.iterate("+",s -> s + "+")
                .parallel() //- order will not be maintained upon uncommenting it
                .limit(1000)
                //.peek(s -> System.out.println(s+" processed in the thread " +Thread.currentThread().getName()))
                .collect(Collectors.toList());
        System.out.println("collect #" + collect.size());

        /*
        * 1. In the above approach sometimes we get exceptions and sometimes we get a valid result.
        * 2. Reason is ArrayList is not thread safe. And it is being accessed by many threads at a time
        * 3. If we take the synchronised version of arraylist then we never get the exception
        * 4. CopyOnWriteArrayList is also thread safe.
        * 5. Donot follow 3 and 4 in production. Performance is terrible
        * 6. Putting values to the list should not happen through forEach method
        * 7. The right approach is to use collect method - this is thread safe and efficient
        * */
    }
}
