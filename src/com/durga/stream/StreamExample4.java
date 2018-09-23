package com.durga.stream;

import java.util.ArrayList;
import java.util.List;

/*
* min() and max() in streams - to use these we have to sort the list first
*
* min(Comparator c) - returns min value according to specified comparator
* */
public class StreamExample4 {
    static public void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(20);
        integerList.add(25);
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);

        Integer minInteger = integerList.stream()
                                        .min((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? +1 : 0)
                                        .get();
        Integer minInteger1 = integerList.stream()
                                        .min(Integer::compareTo)
                                        .get();
        Integer maxInteger = integerList.stream()
                                        .max(Integer::compareTo)
                                        .get();
        Integer maxInteger1 = integerList.stream()
                                        .max((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? +1 : 0)
                                        .get();
        System.out.println("The list is: " +integerList);
        System.out.println();
        System.out.println("The minimum value is(descending order): "+minInteger);
        System.out.println("The maximum value is(descending order): "+maxInteger1);
        System.out.println("The minimum value is(ascending order): "+minInteger1);
        System.out.println("The maximum value is(ascending order): "+maxInteger);


    }
}
