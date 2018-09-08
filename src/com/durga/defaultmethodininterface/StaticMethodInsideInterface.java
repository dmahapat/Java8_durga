package com.durga.defaultmethodininterface;


/*
* Why static method in interface?
* 1. to define general utility methods
* 2. Any class which wants to use the utility method can call the method using the interface name.
* 3. the calling class does not have to be the implementation class
* 4. interface static method is by default not available to the implementation class
* 5. interface static method can only be called using interface name
 * */

interface Interf3{
    public static void m1(){
        System.out.println("Static method inside interface");
    }

}


public class StaticMethodInsideInterface implements Interf3 {

    static public void main(String[] args) {
        StaticMethodInsideInterface staticMethodInsideInterface = new StaticMethodInsideInterface();
        Interf3.m1();// the only possible way to call interface static method

    }
}
