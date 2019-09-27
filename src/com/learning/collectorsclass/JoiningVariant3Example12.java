package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Syntax
 * 1. public static Collector<CharSequence, ?, String> joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
 *    Where,
     – input param delimiter of type CharSequence is the delimiter which will be added between concatenated stream elements
     – input param prefix of type CharSequence will be appended before the joined String
     – input param suffix of type CharSequence will be appended after the joined String
     – output is a Collector, acting on a Stream of elements of type CharSequence, with its finisher returning the ‘collected’ value of type String
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class JoiningVariant3Example12 {
	
	public static void main(String[] args) {
		
		String joinedStr = Stream.iterate(new Integer(0), (Integer intVal) -> intVal+1)
				                 .limit(5)
				                 .map(intVal->intVal.toString())
				                 .collect(Collectors.joining(",","{","}"));
		System.out.println("The joined string is: "+joinedStr);
		
	}

}
