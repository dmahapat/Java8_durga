package com.interview;

public class StaticCheck {
    public static void print(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        StaticCheck s = null;
        s.print();
    }

}
