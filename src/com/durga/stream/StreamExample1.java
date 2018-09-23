package com.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*  We already have java.io.streams
*  While reading and writing data in a file operation we use java.io.stream
*
*  Java 8 stream are pertinent for collection object processing
*
* */
public class StreamExample1 {

    static public void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);
        integerList.add(25);

        /*
        * Java 7 way to list out even integers
        * */

        List<Integer> evenIntegerList = new ArrayList<>();
        for (Integer i: integerList) {
            if(i%2 == 0)
                evenIntegerList.add(i);
        }

        System.out.println("Java 7 way: "+evenIntegerList);

        /*
        * Java 8 way
        * */
        List<Integer> streamIntegers = integerList.stream()
                                                  .filter(integer -> integer%2 == 0)
                                                  .collect(Collectors.toList());

        System.out.println("Stream Integers - filter example: "+streamIntegers);

        List<Integer> doubledList = integerList.stream()
                                               .map(integer -> integer*2)
                                               .collect(Collectors.toList());

        System.out.println("Stream Integers - map example: "+doubledList);

    }
}

