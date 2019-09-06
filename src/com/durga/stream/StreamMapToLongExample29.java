package com.durga.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Stream mapToLong(ToLongFunction mapper) returns a LongStream consisting of 
 *    the results of applying the given function to the elements of this stream.
 * 2. This is an intermidiate operation
 * 3. Syntax:
 *    LongStream mapToLong(ToLongFunction<? super T> mapper)

		Where, LongStream is a sequence of primitive 
		long-valued elements and T is the type 
		of stream elements. mapper is a stateless function 
		which is applied to each element and the function
		returns the new stream.
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamMapToLongExample29 {
	
	public static void main(String[] args) {
		//Creating list of strings
		List<String> integerList = Arrays.asList("25","1","2","3","4","5");

		//using Stream mapToLong function
		integerList.stream()
				   .mapToLong(element->Long.parseLong(element))
				   .forEach(System.out::println);
	}

}
