package com.durga.primitivepredefinedfunctionalinterface;

/*
* AutoBoxing : Integer i always expects object
*
* Integer i = 10 ----it was invalid till java 1.4
* from java 1.5 onwards it is valid. Autoboxing concept came in java 1.5
* After compilation
* Integer i = Integer.valueOf(10)
*
* Autoboxing :
*   1. Automatic conversion of primitive type to wrapper object type
*   2. Compiler is responsible for this conversion
*   3. this concept came in java 1.5
*
* Auto Unboxing :
*
* */


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class AutoBoxingExample1 {

    static public void main (String[] args) {
        //Integer i = 10;
        Integer j = new Integer(10);
        int x = j;// until java 1.4 it was not allowed.
        //this automatic conversion is called autounboxing
        //int x = j.intValue()

        ArrayList<Integer> l = new ArrayList<>();
        //above "Integer" is called type parameter

        //ArrayList<int> intList = new ArrayList<int>();
        //For type parameters we can never use primitive type
        // we have to use only object type

        int[] arr = { 0,5,10,15,20 };
        // The below approach is not upto the mark performance wise
        // For every value autoboxing and auto unboxing happens.
        Predicate<Integer> isEven = i -> i%2 == 0;
        for (int arrValue: arr) {
            if(isEven.test(arrValue))
                System.out.println("Even val: " +arrValue);
        }
        // this approach is also not upto the mark
        Function<Integer,Integer> applyFunction = integer -> integer * integer;
        System.out.println("Square of 4 is: "+applyFunction.apply(4));

    }



}
