package com.durga.lambdawithtreeset;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetLambdaExample {

    /*
    * TreeMap is always meant for sorting order
    * Key values will be inserted according to the sorting order of keys (important point)
    *
    *
    * */
    // In set when we want to maintain order we use TreeSet
    static public void main(String[] args) {
        //When we are not passing any argument then it is meant for natural sorting order
        Set<Integer> set = new TreeSet<Integer>();
        Set<Integer> lambdaSet = new TreeSet<Integer>((object1,object2) -> (object1>object2) ? -1 :(object1<object2) ? +1 : 0);
        //The below is for customized sorting order
        //Set<Integer> set = new TreeSet<Integer>(Comparator);

        Map<Integer,String> treeMap = new TreeMap<Integer, String>();
        Map<Integer,String> lambdaTreeMap = new TreeMap<Integer, String>((object1,object2) -> (object1>object2) ? -1 : (object1<object2) ? +1 : 0);
        set.add(0);
        set.add(20);
        set.add(15);
        set.add(10);
        set.add(5);

        lambdaSet.add(0);
        lambdaSet.add(20);
        lambdaSet.add(15);
        lambdaSet.add(10);
        lambdaSet.add(5);

        treeMap.put(1,"Debasish");
        treeMap.put(3,"JAVA");
        treeMap.put(2,"Prokarma");
        treeMap.put(5,"ISB");
        treeMap.put(4,"Library");

        lambdaTreeMap.put(1,"Debasish");
        lambdaTreeMap.put(3,"JAVA");
        lambdaTreeMap.put(2,"Prokarma");
        lambdaTreeMap.put(5,"ISB");
        lambdaTreeMap.put(4,"Library");

        System.out.println("Default sorting order(ascending-set): " +set);
        System.out.println("Customized sorting order(descending-set): " +lambdaSet);

        System.out.println("Default sorting order(ascending-map): " +treeMap);
        System.out.println("Customized sorting order(ascending-set): " +lambdaTreeMap);




    }
}
