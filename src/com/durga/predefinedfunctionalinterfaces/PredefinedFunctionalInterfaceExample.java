package com.durga.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*
* Examples of predefined functional interfaces
* 1. Predicate
* 2. Function
* 3. Consumer
* 4. Supplier
* 5. ...
* All above predefined functional interfaces are defined in java.util.Function package
* (Comparable,Runnable,Callable,ActionListener these are already existing functional interface)
*
* 1. in lambda expression if we have to give only one parameter then brackets are not required
* and based on the context compiler can understand the type as well,so no need to give types
*
| Functional interface | Abstract method | Signature          |
|----------------------|-----------------|--------------------|
| Predicate            | test            | boolean test(T t); |
| Function             | apply           | R apply(T t);      |
* */
public class PredefinedFunctionalInterfaceExample {

    static public void main(String[] args) {
        Predicate<Integer> isValueGreaterThan10 = integer -> integer > 10;
        System.out.println("100 > 10 ? : "+ isValueGreaterThan10.test(100));
        //if we pass any other parameter to test method we will get compilation error
        //incompatible types
        System.out.println("5 > 10 ? :" +isValueGreaterThan10.test(5));

        Predicate<String> isStringLengthGreaterThan5 = s -> s.length() > 5 ;
        System.out.println("Is length of string \"Debasish\"  greater than 5 ? "+isStringLengthGreaterThan5.test("Debasish"));
        System.out.println("Is length of string \"Bitu\"  greater than 5 ? "+isStringLengthGreaterThan5.test("Bitu"));

        Predicate<Collection> isCollectionEmpty = collection -> collection.isEmpty();
        List l = new ArrayList();
        List l1 = new ArrayList();
        l.add("a");
        System.out.println("is collection \"l\" empty ?" + isCollectionEmpty.test(l));
        System.out.println("is collection \"l1\" empty ?" + isCollectionEmpty.test(l1));
    }
}
