package com.durga.doublecolonoperator;
/*
* We can use :: for method reference and constructor reference
* */

interface MyInterface {
    public void m1();
}
public class Example1 {

    public static void m2(){
        System.out.println("m2(): m1() is referring me");
    }

    public int m3(){
        System.out.println("Returning a 0");
        return 0;
    }

    static public void main(String[] args) {

        MyInterface myInterface =   () -> {
            System.out.println("Lambda Implementation");
        };
        myInterface.m1();

        /*
        * when we want m1 to refer m2 the below is going to be the syntax
        *
        * Advantage of :: -> Code reusability, it is an alternative to lambda expression
        *
        * for method reference both methods have to have same number of parameters
        * rest all(name,modifier,return type) can be ignored
        * */
        // Below is static method reference
        // for instance method we have to give objectref::methodname

        Example1 example1 = new Example1();
        MyInterface anInterface = Example1::m2;
        MyInterface myInterface1 = example1::m3;
        anInterface.m1();
        myInterface1.m1();

    }
}
