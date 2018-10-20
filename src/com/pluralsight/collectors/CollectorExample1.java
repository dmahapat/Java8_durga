package com.pluralsight.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Collector:
*  1. is a special type of reduction
*  2. is a terminal operation,triggers the computation of the stream
*  3.
*
*
* */
public class CollectorExample1 {
    public static void main(String[] args) {
        List<String> kidNames = Arrays.asList("Olivia","Ruby","Emily","Grace");
        List<String> result = new ArrayList<>();

        kidNames.stream()
                .filter(s -> !s.isEmpty())
                .forEach(item ->result.add(item));
        System.out.println(result);
        /*
        * Problem in above code
        * 1. we add elements to an external list
        * 2. we should not do that
        * 3. because, the list is final and this cannot be added concurrently
        * 4. arraylist is not threadsafe
        * 5. so we cannot go parallel in this
        * better approach is presented below
        * */
        result.clear();
        kidNames.stream()
                .parallel()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(result);

        //The above step is called mutable collection
        // just because it collects data in a mutable container


    }
}
