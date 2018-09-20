package com.durga.primitivepredefinedfunctionalinterface;

import java.util.function.*;


/*
* | Primary Functional Interface | Input type is always | Return type is always | Functional interface to use | Method signature                      |
|------------------------------|----------------------|-----------------------|-----------------------------|---------------------------------------|
| Function                     | int                  | anything              | IntFunction                 | public R apply(int i);                |
| Function                     | long                 | anything              | LongFunction                | public R apply(long l);               |
| Function                     | double               | anything              | DoubleFunction              | public R apply(double d);             |
| Function                     | anything             | int                   | ToIntFunction               | public int applyAsInt(T t);           |
| Function                     | anything             | long                  | ToLongFunction              | public long applyAsLong(T t);         |
| Function                     | anything             | double                | ToDoubleFunction            | public double applyAsDouble(T t);     |
| Function                     | int                  | long                  | IntToLongFunction           | public long applyAsLong(int i);       |
| Function                     | int                  | double                | IntToDoubleFunction         | public double applyAsDouble(int i);   |
| Function                     | long                 | int                   | LongToIntFunction           | public int applyAsInt(long l);        |
| Function                     | long                 | double                | LongToDoubleFunction        | public double applyAsDouble(long l);  |
| Function                     | double               | int                   | DoubleToIntFunction         | public int applyAsDouble(double d);   |
| Function                     | double               | long                  | DoubleToLongFunction        | public long applyAsLong(double d);    |
| Function                     | anything             | int                   | ToIntBiFunction             | public int applyAsInt(T t,U u);       |
| Function                     | anything             | long                  | ToLongBiFunction            | public long applyAsLong(T t,U u);     |
| Function                     | Anything             | double                | ToDoubleBiFunction          | public double applyAsDouble(T t,U u); |
*
*
*
*
*
*
*
* */




public class FunctionPrimitiveExample3 {

    static public void main(String[] args) {

        //The below approach is not good as multiple AutoBoxing and Unboxing functionalities are being performed

        Function<Integer,Integer> squareIt = integer -> integer * integer;
        System.out.println("Square of 5 is :" + squareIt.apply(5));
        /*
        * The below always takes "int" as input "Integer" is return type
        * */
        IntFunction<Integer> squareItPrimitive = value -> value * value;
        System.out.println("Square of 10 in PrimitiveFunction way:" +squareItPrimitive.apply(10));

        Function<String,Integer> getLengthOfString = s -> s.length();
        System.out.println("The length of \"Debasish\" "+getLengthOfString.apply("Debasish"));

        //BetterWay of doing above

        ToIntFunction<String> getLengthOfStringPrimitivetype = value -> value.length();
        System.out.println("The length of \"Roshni\" "+getLengthOfStringPrimitivetype.applyAsInt("Roshni"));


        Function<Integer,Double> getSquareRoot = integer -> Math.sqrt(integer);
        System.out.println("Square Root of 4 is: "+getSquareRoot.apply(4));

        //Better way of doin above

        IntToDoubleFunction getSquareRootPrimitive = value -> Math.sqrt(value);
        System.out.println("Square root of 5 IntToDouble Function(primitive):" +getSquareRootPrimitive.applyAsDouble(5));

    }
}
