package com.durga.consumerfunctionalinterface;

/*
* Unlike Predicate and Function, Consumer interface does not return anything
*
* When the expectation is only to consume the value passed in that case we should use "Consumer"
* - no return type expected
*
* interface Consumer<T> {
*  void accept(T t);
* }
*
* */


import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {

    static public void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println("Hello "+s);
        stringConsumer.accept("Debasish");
    }
}
