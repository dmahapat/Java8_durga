package com.durga.functionalinterface;

@FunctionalInterface
interface Interface2 {

    /**
     * Why should functional interface contain single abstract method ?
     *
     * Ans : If there are multiple abstract methods then compiler gets confused to which method the
     * lambda expression should be mapped.
     *
     * Functional interface concept came only to support lambda expression. It is the type of lambda expression
     * @param a
     * @param b
     */

    public void add(int a , int b);
}
