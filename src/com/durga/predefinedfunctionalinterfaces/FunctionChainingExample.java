package com.durga.predefinedfunctionalinterfaces;

import java.util.function.Function;

/*
* if there are 2 Function(functional interface)
* f1 and f2
*
* the way we can chain these is f1.andThen(f2) --- first f1 will be  applied followed by f2
* f1.compose(f2) ------- f2 will be applied followed by f1
* They are reverse of each other
* */
public class FunctionChainingExample {

    static public void main(String[] args) {
        Function<String,String> convertToUppercase = s -> s.toUpperCase();
        Function<String,String> getFirst3Characters = s -> s.substring(0,3);
        System.out.println("String Roshni in uppercase letters: "+convertToUppercase.apply("Roshni"));
        System.out.println("Get first three characters of string Roshni : "+getFirst3Characters.apply("Roshni"));

        System.out.println(convertToUppercase.andThen(getFirst3Characters).apply("Roshni"));
        System.out.println(convertToUppercase.compose(getFirst3Characters).apply("Roshni"));


        Function<Integer,Integer> doubleIt = integer -> 2 * integer;
        Function<Integer,Integer> cubeIt = integer -> integer * integer * integer;

        System.out.println(doubleIt.andThen(cubeIt).apply(2));
        System.out.println(doubleIt.compose(cubeIt).apply(2));
    }
}
