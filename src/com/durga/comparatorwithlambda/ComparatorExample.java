package com.durga.comparatorwithlambda;

// Comparator interface contains only one abstract method i.e "compare" method
// Hence this qualifies to be a functional interface
// Usage of Comparator interface
// 1. To define customised sorting
// public int compare(Object obj1,Object obj2)
// returns negative value - if obj1 has to come before obj2
// returns positive value - if obj1 has to come after obj2
// returns 0 - if both objects are equal

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

    public int compare(Integer i1 , Integer i2) {
        /*if(i1 > i2){
            return -1;
        }else if(i1 < i2){
            return 1;
        }else {
            return 0;
        }*/
        return (i1>i2) ? -1 : ((i1<i2) ? 1 : 0) ;
    }
}


public class ComparatorExample {

    static public void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        System.out.println("Before sorting list contains: " +al);
        //Sorting now
        //Default nature of sorting is ascending order for integers
        //Default nature of sorting is alphabetical order for strings
        Collections.sort(al);
        System.out.println("After sorting(natural sorting - ascending): " +al);
        //Using customised sorting
/*        Collections.sort(al,new MyComparator());
        System.out.println("After customised sorting(descending): " +al);*/
        System.out.println("Implement customised sorting using lambda expression");
        Collections.sort(al,(i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? +1 : 0);
        System.out.println("After customised sorting using lambda (descending): " +al);
    }
}
