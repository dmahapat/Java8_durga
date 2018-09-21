package com.durga.unaryoperatorprimitiveversion;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorPrimitiveExample3 {

    static public void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (integer, integer2) -> (integer + integer2);
        System.out.println(integerBinaryOperator.apply(10,20));

        /*
        * We ger autoboxing and autounboxing problem in above approach
        * */

        IntBinaryOperator intBinaryOperator = (left, right) -> (left+right);
        System.out.println("IntBinaryOperator: "+intBinaryOperator.applyAsInt(10,200));

        LongBinaryOperator longBinaryOperator = (left, right) -> (left+right);
        System.out.println("LongBinaryOperator: "+longBinaryOperator.applyAsLong(12,12));

        DoubleBinaryOperator doubleBinaryOperator = (left, right) -> (left+right);
        System.out.println("DoubleBinaryOperator: "+doubleBinaryOperator.applyAsDouble(12,12));



    }
}
