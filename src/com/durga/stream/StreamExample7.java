package com.durga.stream;

import java.util.stream.Stream;
/*
* We can use Stream.of() method on a group of values as well as on arrays
* */
public class StreamExample7 {

    static public void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(9,99,999,9999,99999);
        Double[] doubles = {10.0,10.1,10.2,10.3};
        System.out.println("Stream applied to Group of values: ");
        integerStream.forEach(System.out::println);
        Stream<Double> doubleStream = Stream.of(doubles);
        System.out.println("Stream applied to Double array: ");
        doubleStream.forEach(System.out::println);

    }
}
