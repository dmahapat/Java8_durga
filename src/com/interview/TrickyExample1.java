package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrickyExample1 {
    // While picking method for overloading the most specific method
    // gets picked. Hence the string implementation will be picked

    public static void main(String[] args) {
        foo(null);

    }
    public static void foo(Object o){
        System.out.println("Object implementation");
    }

    public static void foo(String s){
        System.out.println("String Implementation");
    }

    //Uncommenting the below code will result in compile time exception

    /*public static void foo(StringBuffer i){
        System.out.println("StringBuffer impl");
    }*/
}
