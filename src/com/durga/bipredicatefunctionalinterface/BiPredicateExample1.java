package com.durga.bipredicatefunctionalinterface;

/*
* 1. Predicate takes only one input parameter but
*    BiPredicate can take 2 input parameter
* 2. Function takes only one input parameter but
 *   BiFunction can take 2 input parameter
 *3. Consumer takes only one input parameter but
 *   BiConsumer can take 2 input parameter
 *4. Supplier never takes any input.
 *   Hence no BiSupplier
* */


import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    static public void main(String[] args) {
        //and,or,negate methods are available too
        BiPredicate<Integer,Integer> isSumEven = (a,b) -> ((a+b)%2 == 0);
        System.out.println(isSumEven.test(5,3));
        System.out.println(isSumEven.test(10,2));
    }
}
