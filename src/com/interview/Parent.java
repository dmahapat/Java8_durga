package com.interview;

public class Parent {

    void print(){
        System.out.println("In Parent");
    }

    public static void main(String[] args) {
        Child p = new Child();
        p.print();
    }
}

class Child extends Parent {
    void print(){
        System.out.println("In Child");
    }
}
