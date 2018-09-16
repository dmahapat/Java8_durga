package com.durga.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

/*
* | Functional interface | Method  | Method Type      | Method Signature                                     |
|----------------------|---------|------------------|------------------------------------------------------|
| Predicate            | test    | Abstract method  | boolean test(T t);                                   |
| Predicate            | and     | default          | default Predicate<T> and(Predicate<? super T> other) |
| Predicate            | or      | default          | default Predicate<T> or(Predicate<? super T> other)  |
| Predicate            | negate  | default          | default Predicate<T> negate()                        |
| Predicate            | isEqual | static           | static Predicate<T> isEqual (Object targetref)       |
* */
public class PredicateMethodAnalysis {

    static public void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("Debasish");
        System.out.println("Is Debasish: "+predicate.test("Debasish"));

        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Debasish","CEO",30000,"Hyderabad"));
        System.out.println("Is CEO: "+isCEO.test(new Employee("Debasish","CEO",30000,"Hyderabad")));

    }
}
