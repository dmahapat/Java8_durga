package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 1. Stream findAny() returns an Optional (a container object which may or 
 *    may not contain a non-null value) describing some element of the stream, 
 *    or an empty Optional if the stream is empty.
 * 2. findAny() V/s findFirst() :
 *    The findAny() method returns any element from a Stream but there might be a 
 *    case where we require the first element of a filtered stream to be fetched.
 * 3. When the stream being worked on has a defined encounter order(the order in which 
 *    the elements of a stream are processed), then findFirst() is useful which returns the first element in a Stream.
 *    
 *    Syntax:
 *    
 *    Optional<T> findAny()
		Where, Optional is a container object which
		may or may not contain a non-null value 
		and T is the type of objects and the function
		returns an Optional describing some element of
		this stream, or an empty Optional if the stream is empty.
		
	Note : findAny() is a terminal-short-circuiting operation of Stream interface. This method returns any first element 
	       satisfying the intermediate operations. This is a short-circuit operation because it just needs ‘any’ first 
	       element to be returned and terminate the rest of the iteration.	   
 * @author DebasishM2
 *
 */
public class StreamFindAnyExample30 {
	// Java code for Stream findAny() 
	// which returns an Optional describing 
	// some element of the stream, or an 
	// empty Optional if the stream is empty. 
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,55,78,88);
		
		 // Using Stream findAny() to return 
        // an Optional describing some element 
        // of the stream
		Optional<Integer> answer = intList.stream().findAny();
		answer.ifPresent(System.out::println);
		
		
		
		
		
	}

}
