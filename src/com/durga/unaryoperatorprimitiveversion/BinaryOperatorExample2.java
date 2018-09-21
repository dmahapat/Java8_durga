package com.durga.unaryoperatorprimitiveversion;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample2 {
    static public void main(String[] args) {

        BiFunction<String,String,String> stringStringStringBiFunction = (s, s2) -> s+" "+s2;
        System.out.println("Concatenation operation BiFunction Way: "+stringStringStringBiFunction.apply("Debasish","Mahapatra"));


        /*
        * We should go for "BinaryOperator"
        * */

        BinaryOperator<String> stringBinaryOperator = (s, s2) -> s + " " + s2;
        System.out.println("Concatenation operation BinaryOperator way: "+stringBinaryOperator.apply("Roshni","Deepti"));





    }
}
