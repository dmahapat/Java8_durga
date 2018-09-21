package com.durga.unaryoperatorprimitiveversion;

import java.util.function.*;

public class Example1 {

    static public void main(String[] args){
        Function<Integer,Integer> squareIt = integer -> integer * integer;
        System.out.println("The square of 4 is: "+squareIt.apply(4));

        /*
        * When we have input and output type same.Then we have a special interface
        * which is called "UnaryOperator"- this is child interface of "Function"
        *
        * */

        UnaryOperator<Integer> integerUnaryOperator = integer -> integer * integer;
        System.out.println("The square of 5 in UnaryOperator way is: "+integerUnaryOperator.apply(5));

        /*
        * Again autoboxing problem is going to occur,in above approach
        * */
        //IntUnaryOperator
        //LongUnaryOperator
        //DoubleUnaryOperator
        IntUnaryOperator intUnaryOperator = operand -> operand * operand;
        System.out.println("IntUnaryOperator: " +intUnaryOperator.applyAsInt(34));

        LongUnaryOperator longUnaryOperator = operand -> operand * operand;
        System.out.println("Long unary operator: "+longUnaryOperator.applyAsLong(20));

        DoubleUnaryOperator doubleUnaryOperator = operand -> operand * operand;
        System.out.println("Double unary operator: "+doubleUnaryOperator.applyAsDouble(10.0));


    }
}
