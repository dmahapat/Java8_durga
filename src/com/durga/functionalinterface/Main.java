package com.durga.functionalinterface;


import java.text.DecimalFormat;

//while implementing functional interface(Interf here) using lambda expression we should not use
//implements Interf like below
public class Main /*implements Interf*/ {


    public static void main(String[] args) {


        Interf i = () -> System.out.println("Calling m1()");

        //Below we are not providing any types for a and b.Compiler automatically guesses the type.This is called type inference
        Interface2 i2 = (a,b) -> System.out.println("The sum is " + (a+b));
        Interface3 i3 = s -> s.length();
        Interface4 i4 = x -> (x * x);
        i.m1();
        i2.add(100,200);
        System.out.println("Lenght of string \"Hello\" is: " + i3.getLength("Hello"));
        System.out.println("Square value of 4 is: " + i4.squareIt(4));

    }
}
