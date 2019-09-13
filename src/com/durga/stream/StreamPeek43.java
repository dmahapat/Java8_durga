package com.durga.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 1. Stream peek(Consumer action) returns a stream consisting of the elements of this stream, 
 *    additionally performing the provided action on each element as elements are consumed from the resulting stream.
 * 2. This is an intermediate operation i.e, it creates a new stream that, when traversed, contains the elements of 
 *    the initial stream that match the given predicate.
 * 3. Stream<T> peek(Consumer<? super T> action)

	Where, Stream is an interface and T is the type of 
	stream elements. action is a non-interfering action
	to perform on the elements as they are consumed 
	from the stream and the function returns the new stream. 
	
	     
	     This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline.
		 Since Java 9, if the number of elements is known in advance and unchanged in the stream, the .peek () statement will not be executed due to performance optimization. It is possible to force its operation by a command (formal) changing the number of elements eg. .filter (x -> true).
		 Using peek without any terminal operation does nothing.
 * 
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamPeek43 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);
		
		// Using peek without any terminal 
        // operation does nothing. Hence this 
        // code will produce no output. 
        list.stream().peek(System.out::println); 
	}
}
