package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. <T,U> Collector<T,?,U> reducing(U identity, Function<? super T,? extends
 * U> mapper, BinaryOperator<U> op) 
 * op: a BinaryOperator which reduces the input
 * values
 * identity: The identity value for the reduction, i.e. for all input elements
 * x:
 * op(identity,x) == x
 * mapper: a mapping function for input type T to U conversion.
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class ReducingVariant3Example20 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(5,10,15,20,50).parallel();
		String str = s.collect(Collectors.reducing("",x->Integer.toString(x),(i1,i2)->i1+" "+i2));
		System.out.println(str);
	}
}
