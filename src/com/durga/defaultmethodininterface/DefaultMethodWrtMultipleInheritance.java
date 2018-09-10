package com.durga.defaultmethodininterface;


interface Left {
    default void m1() {
        System.out.println("Left default method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right default method");
    }
}

public class DefaultMethodWrtMultipleInheritance implements Left, Right {

    /*if we donot write (override) the below method then we get compilation error
    DefaultMethodWrtMultipleInheritance inherits unrelated defaults for m1() from types Left and Right
    inorder to resolve conflict we can override the method and give our own implementation

    OR   we can call the Left interface implementation
    OR   we can call the Right interface implementation
    OR   we can call both implementation

*/

   /*
    | Interface with default method                                                                               |                                       Abstract class                                      |
    |-------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------:|
    | In interface every variable is public static final.We cannot declare instance variables in interface        | Inside abstract class we can declare instance variables,which can be used for child class |
    | Interface never talks about state of object,it always talks about static variables and no instance variable |                       Abstract class can talk about state of object                       |
    | no declaration of constructor                                                                               |                                We can declare constructors                                |
    | no instance and static block                                                                                | yes there are instance and static block declaration are possible                          |
    | Functional interface with default methods can refer lambda expression                                       | Abstract class cannot refer lambda expression                                             |
    | Inside interface we cannot override object class methods                                                    | In side abstract class we can override object class methods                               |
   */


    @Override
    public void m1() {
        System.out.println("My Own Implementation");
        Left.super.m1();
        Right.super.m1();
    }

    static public void main(String[] args) {
        DefaultMethodWrtMultipleInheritance defaultMethodExample = new DefaultMethodWrtMultipleInheritance();
        defaultMethodExample.m1();
    }


}
