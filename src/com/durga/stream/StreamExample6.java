package com.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
* toArray() - method present in stream interface
* 1. used to copy a stream into an array
*
* */
public class StreamExample6 {

    static public void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);
        integerList.add(25);

        System.out.println("The list of integers are: "+integerList );

        Integer[] integers = integerList.stream()
                                        .toArray(Integer[]::new);

        System.out.println("The members of array are: " );
        Consumer<Integer> printElement = integer -> System.out.println(integer);
        for (Integer x: integers ) {
            printElement.accept(x);
        }
    }
}
