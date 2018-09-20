package com.durga.primitivepredefinedfunctionalinterface;


/*
* IntPredicate - special predicate which can take "int" input
* Performance wise highly recommended : while dealing with primitive value
*
* */


import java.util.function.IntPredicate;

public class PredicatePrimitivieExample2 {
    static public void main(String[] args) {
        int[] x = { 0,5,10,15,20 };
        IntPredicate isEven = value -> value%2 == 0;
        /*
        * Similarly we have "LongPredicate" , "DoublePredicate"
        * */
        for ( int val: x ) {
            if(isEven.test(val))
                System.out.println("Even Value in the array: "+ val);
        }

    }
}
