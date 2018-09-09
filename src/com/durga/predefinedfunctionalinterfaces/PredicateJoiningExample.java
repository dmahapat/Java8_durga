package com.durga.predefinedfunctionalinterfaces;

/*
* Predicate Joining
* 1. predicate1: number > 10?
* 2. predicate2: number%2 == 0 ?
* If we want to check !(number > 10) => predicate1.negate()
* If we want to check (number>10)&&(number%2==0) => predicate1.and(predicate2)
* If we want to check (number>10)||(number%2==0) => predicate1.or(predicate2)
*
* negate(),and(),or() are default methods of "Predicate" functional interface
* */

import java.util.function.Predicate;

public class PredicateJoiningExample {

    public static void checkArray(Predicate<Integer> predicate,int[] array){
        for (int number: array) {
            if(predicate.test(number)){
                System.out.println(number);
            }
        }
    }

    static public void main(String[] args) {

        int[] x = {0,5,10,15,20,25,30};
        Predicate<Integer> isNumberGreaterThan10 = integer -> integer > 10;
        Predicate<Integer> isNumberEven = integer -> (integer%2) == 0;

        System.out.println("The numbers greater than 10 are: ");
        checkArray(isNumberGreaterThan10,x);

        System.out.println("The even numbers in the array are: ");
        checkArray(isNumberEven,x);

        System.out.println("The numbers not greater than 10 in the array are: ");
        checkArray(isNumberGreaterThan10.negate(),x);

        System.out.println("The numbers greater than 10 and even in the array are: ");
        checkArray(isNumberGreaterThan10.and(isNumberEven),x);

        System.out.println("The numbers greater than 10 or even in the array are: ");
        checkArray(isNumberGreaterThan10.or(isNumberEven),x);




    }
}
