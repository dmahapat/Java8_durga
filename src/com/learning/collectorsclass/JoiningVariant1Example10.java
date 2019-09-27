package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Predefined Collector returned by Collectors.joining() method with no arguments
 * 2. Signature:
 *    public static Collector<CharSequence, ?, String> joining()
 *    Where,
     – output is a Collector, which collects a Stream of elements of type CharSequence, with its finisher returning the ‘collected’ value of type String
     
     NOTE:
     The Collector returned by Collectors.joining() method returns a String which is the concatenation of all elements of the Stream. 
     An important thing to keep in mind regarding the joining collector is that it needs a stream of type java.lang.
     CharSequence to be fed as input to it. In other words, joining collector can only concatenate streams whose elements are subclasses of CharSequence interface.
      String, StringBuffer, StringBuilder are some of the subclasses of CharSequence which you will be using in most of joining scenarios. 
     It is also worthwhile to note that internally the joining collector uses a StringBuilder instance to concatenate the stream elements.
 * 
 * 
 * @author DebasishM2
 *
 */
public class JoiningVariant1Example10 {
	
	public static void main(String[] args) {
		String joinedStr = Stream.iterate(new Integer(0),(Integer integer) -> integer+1)
							     .limit(5)
							     .map(intVal->intVal.toString())
							     .collect(Collectors.joining());
		System.out.println("Joined value is: "+joinedStr);
	}

}
