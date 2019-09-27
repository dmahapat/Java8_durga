package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Syntax:
 *    <T> Collector<T,?,T> reducing(T identity,BinaryOperator<T> op)
 *    op: a BinaryOperator which reduces the input values
 *    identity: The identity value for the reduction, i.e. for all input elements x:
 * @author DebasishM2
 *
 */
public class ReducingVariant2Example19 {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(5,10,20,50);
		Integer reducedVal = stream.collect(Collectors.reducing(1,(i1,i2)->i2*i1));
		System.out.println(reducedVal);
	}

}
