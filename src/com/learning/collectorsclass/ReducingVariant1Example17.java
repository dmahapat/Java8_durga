package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Syntax:
 *    <T> Collector<T,?,Optional<T>> reducing(BinaryOperator<T> op)
 *    op: a BinaryOperator which reduces the input values
 * @author DebasishM2
 *
 */
public class ReducingVariant1Example17 {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(5,10,20,50);
		Integer reducedVal = stream.collect(Collectors.reducing((i1,i2)->i2-i1))
		.orElse(-1);
		System.out.println(reducedVal);
	}

}
