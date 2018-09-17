package com.durga.predefinedfunctionalinterfaces;

import java.util.function.Function;

/*
*
* | Functional interface | Method   | Method Type | Signature                                                                | Usage                                                                                                                           |
|----------------------|----------|-------------|--------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| Function             | apply    | abstract    | R apply(T t);                                                            | Applies this function to the given argument.                                                                                    |
| Function             | andThen  | default     | default Function<T,V> andThen( Function<? super  R,? extends V> after)   | Returns a composed function that first applies this function to its input, and then applies the  after function to the result.  |
| Function             | compose  | default     | default Function<T,V> compose(  Function<? super   R,? extends V> after) | Returns a composed function that first applies the  before function to its input, and then applies this function to the result. |
| Function             | identity | static      | static <T> Function<T,T> identity ()                                     | Returns a function that always returns its input argument.                                                                      |
*
*   apply:
*
*   R apply(T t)
        Applies this function to the given argument.
    Parameters:
        t - the function argument
    Returns:
        the function result
*
*   compose:
*
*   default <V> Function<V,R> compose(Function<? super V,? extends T> before)
        Returns a composed function that first applies the before function to its input, and then applies this function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function.
    Type Parameters:
        V - the type of input to the before function, and to the composed function
    Parameters:
        before - the function to apply before this function is applied
    Returns:
        a composed function that first applies the before function and then applies this function
    Throws:
        NullPointerException - if before is null
*
*   andThen:
*
*   default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
        Returns a composed function that first applies this function to its input, and then applies the after function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function.
    Type Parameters:
        V - the type of output of the after function, and of the composed function
    Parameters:
        after - the function to apply after this function is applied
    Returns:
        a composed function that first applies this function and then applies the after function
    Throws:
        NullPointerException - if after is null
* */

public class FunctionMethodAnalysis {

    static public void main(String[] args) {
        Function<String,String> function = Function.identity();
        System.out.println(function.apply("Roshni"));
    }
}
