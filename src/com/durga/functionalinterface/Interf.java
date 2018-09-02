package com.durga.functionalinterface;

/**
 * Functional Interface has to have only single abstract method
 * @FunctionalInterface annotation is used to instruct the compiler to raise objection
 * if more than one or 0 abstract methods are defined in the interface
 */

/**
 * Functional Interface
 * 1. It contains single abstract method
 * 2. It can contain any number of default and static method
 * 3. It acts as a type for lambda expression
 *    e.g Interf i = () -> System.out.println();
 * 4. It can be used to invoke lambda expression
 */


@FunctionalInterface
interface Interf {
    public void m1();
    //public void m2(int a , int b);
    //public void m2();
    //uncommenting above line would give compile time error cause there will be more than one abstract methods in this interface
}
