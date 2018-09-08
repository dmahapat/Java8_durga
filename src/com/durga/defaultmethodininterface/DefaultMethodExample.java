package com.durga.defaultmethodininterface;

interface Interf {
    default void m1() {
        System.out.println("Interface Definition");
    }
}


public class DefaultMethodExample implements Interf {

    /*@Override
    public void m1() {
        System.out.println("In Implementation class");
    }*/

    //uncommenting the above will be executing the above code

    static public void main(String[] args) {
        DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
        defaultMethodExample.m1();
    }
}
