package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * 1. Stream findFirst() returns an Optional (a container object which 
 *    may or may not contain a non-null value) describing the first element of this stream, or 
 *    an empty Optional if the stream is empty. If the stream has no encounter order, then any element may be returned.
 * 2. Syntax:
 *    Optional<T> findFirst()

	Where, Optional is a container object which
	may or may not contain a non-null value 
	and T is the type of objects and the function
	returns an Optional describing the first element 
	of this stream, or an empty Optional if the stream is empty.   
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamFindFirst41 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3,5,7,9,11);
		
		Optional<Integer> answer = integers.stream().filter(val->val%5==0).findFirst();
		
		answer.ifPresent(System.out::print);
	}

}
