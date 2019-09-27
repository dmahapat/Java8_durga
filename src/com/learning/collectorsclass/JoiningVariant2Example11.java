package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Overloaded Collectors.joining() method which accepts a delimiter is defined with the following signature 
 * 2. Syntax:
 *    public static Collector<CharSequence, ?, String> joining(CharSequence delimiter)
 *    Where,
     – delimiter is the only input parameter of type CharSequence
     – output is a Collector, acting on a Stream of elements of type CharSequence, with its finisher returning the ‘collected’ value of type String
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class JoiningVariant2Example11 {
	public static void main(String[] args) {
		String joinedStr = Stream.iterate(new Integer(0), (Integer intVal) -> intVal+1)
				                 .limit(5)
				                 .map(valInt -> valInt.toString())
				                 .collect(Collectors.joining(","));
		System.out.println("Joined string is: "+joinedStr);
	}
}
