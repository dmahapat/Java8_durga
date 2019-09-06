package com.durga.stream;

import java.util.Arrays;
import java.util.List;

// Stream forEachOrdered(Consumer action) performs an action for 
// each element of this stream, in the encounter order of the stream if the stream has a defined encounter order. 
// Stream forEachOrdered(Consumer action) is a terminal operation i.e, it may traverse the stream to produce a result or a side-effect.

/**
 * 
 * Syntax:
 * void forEachOrdered(Consumer<? super T> action)

	Where, Consumer is a functional interface which 
	is expected to operate via side-effects. and T 
	is the type of stream elements.
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamForEachOrdered32 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(10,19,20,1,2);
		
		// Using forEachOrdered(Consumer action) to  
	    // print the elements of stream in encounter order 
		intList.stream().forEachOrdered(System.out::println);
	}

}
