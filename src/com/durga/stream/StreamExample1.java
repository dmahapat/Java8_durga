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
*  1. Java provides a new additional package in Java 8 called java.util.stream
*  2. This package consists of classes, interfaces and enum 
*     to allow functional-style operations on the elements.
*  3. Stream does not store elements. It simply conveys elements from a source 
*     such as a data structure, an array, or an I/O channel, through a pipeline 
*     of computational operations.
*  4. Stream is functional in nature. Operations performed on a stream does not 
*     modify it's source. For example, filtering a Stream obtained from a 
*     collection produces a new Stream without the filtered elements, 
*     rather than removing elements from the source collection.  
*  5. Stream is lazy and evaluates code only when required.
*  6. The elements of a stream are only visited once during the life of a stream. 
*     Like an Iterator, a new stream must be generated to revisit the same 
*     elements of the source.       
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

