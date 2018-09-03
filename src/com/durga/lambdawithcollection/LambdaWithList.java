package com.durga.lambdawithcollection;


import java.util.*;

/**
 * 1. We use List when we want the insertion order to be preserved
 * 2. Duplicate objects are allowed
 *
 * List is an interface *
 * various implementation classes of List are "ArrayList","LinkedList","Vector","Stack"
 *
 * Set: is an interface
 * 1. Duplicates are not allowed
 * 2. Order is not preserved
 * various implementation classes "HashSet"
 *
 * Map: When we want to represent a group of objects as key value pair we should go for map concept
 *
 * HashMap,TreeMap
 */
public class LambdaWithList {

    static public void main(String[] args) {
        List<String> al = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        set.add("Sunny");
        set.add("Bunny");
        set.add("Chinny");
        set.add("Sunny");
        System.out.println(set);
        System.out.println("****Map Concept*****");

    }
}
