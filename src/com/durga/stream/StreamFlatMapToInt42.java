package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 1. Stream flatMapToInt(Function mapper) returns an IntStream consisting of the results of 
 *    replacing each element of this stream with the contents of a mapped stream produced by 
 *    applying the provided mapping function to each element. Stream flatMapToInt(Function mapper) 
 *    is an intermediate operation. These operations are always lazy. Intermediate operations are 
 *    invoked on a Stream instance and after they finish their processing, they give a Stream instance
 *  
 *  IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper)

	Where, IntStream is a sequence of primitive 
	int-valued elements and T is the type 
	of stream elements. mapper is a stateless function 
	which is applied to each element and the function
	returns the new stream.
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamFlatMapToInt42 {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("1","2","3","4");
		
		strings.stream().flatMapToInt(val->IntStream.of(Integer.parseInt(val))).forEach(System.out::println); // flatMapToInt() - returns a stream of numbers 
		
		strings.stream().mapToInt(str->Integer.parseInt(str)).forEach(System.out::print); // mapToInt() - returns a particular int value
		
	}

}
