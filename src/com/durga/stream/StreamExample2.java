package com.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static boolean isGreaterThan3(String param) {
        return param.length() > 3;
    }
    static public void main(String[] args) {
        /*
        * To create stream object we got to do the following
        *
        * Stream s = c.stream(); - where c is any collection object
        *            stream method is present inside collection interface as default method
        *
        * Stream is an interface present in java.util.stream package
        * filter and map method are present in Stream interface
        * public Stream filter(Predicate<T> t); - t can be boolean valued function or lambda expression
        * public Stream map(Function<T> t); -
        * */

        /*
        * Collect method example
        * */
        List<String> nameList = new ArrayList<>();
        nameList.add("Debasish");
        nameList.add("Roshni");
        nameList.add("Deepankar");
        nameList.add("San");
        nameList.add("Sub");
/*
        List<String> filteredStrings = nameList.stream()
                                               .filter(s -> s.length() > 3)
                                               .collect(Collectors.toList());*/
        /*
        * Alternative way
        * */
        List<String> filteredStrings = nameList.stream()
                .filter(StreamExample2::isGreaterThan3)
                .collect(Collectors.toList());
        System.out.println("filteredStrings are: "+filteredStrings);

        List<String> mappedStrings = nameList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Mapped strings are: "+mappedStrings);




    }
}
