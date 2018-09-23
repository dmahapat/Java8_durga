package com.durga.stream;

/*
* forEach method in streams
* 1. does not return anything
* 2. This method can take lambda expression as argument and applies that lambda to each element in the stream
*
*
* */


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample5 {

    static public void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Debasish");
        stringList.add("Roshni");
        stringList.add("Deepankar");
        System.out.println("In lambda expression way");
        stringList.stream()
                .forEach(s -> System.out.println(s));
        System.out.println("In method reference way");
        stringList.stream()
                .forEach(System.out::println);
        System.out.println("In consumer functional interface way: ");
        Consumer<String> printElement = s -> System.out.println(s);
        stringList.stream()
                .forEach(printElement);

    }
}
