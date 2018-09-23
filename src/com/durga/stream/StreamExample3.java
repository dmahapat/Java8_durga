package com.durga.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

    static public void main(String[] args) {
        /*
        * count() is present in Stream interface
        * */
        List<String> nameList = new ArrayList<>();//null;
        nameList.add("Debasish");
        nameList.add("Roshni");
        nameList.add(null);
        nameList.add("Deepankar");
        nameList.add("San");
        nameList.add("Sub");

        long numberOfNamesGreaterThan3Length = nameList.stream()
                                                        .filter(s -> s!=null && s.length()>3)
                                                        .count();
        System.out.println("The number of strings greater than 3 length: "+numberOfNamesGreaterThan3Length);

        /*
        * sorted() - sorting elements of the stream (default sorting order or customized order)
        * */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(5);
        integerList.add(20);
        integerList.add(25);
        integerList.add(10);
        integerList.add(15);

        Comparator<Integer> descendingOrderComparator = (o1, o2) -> (o1>o2) ? -1 : ((o1<o2) ? 1 : 0);

        List<Integer> sortedList = integerList.stream()
                                                .sorted()
                                                .collect(Collectors.toList());
        List<Integer> descendingOrderedList = integerList.stream()
                                                            .sorted(descendingOrderComparator)
                                                            .collect(Collectors.toList());
        System.out.println("Unsorted List: "+integerList);
        System.out.println("Sorted List(ascending order): "+sortedList);
        System.out.println("Sorted List(descending order): "+descendingOrderedList);





    }
}
