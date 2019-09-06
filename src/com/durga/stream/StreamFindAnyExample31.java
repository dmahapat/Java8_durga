package com.durga.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 * The behavior of Stream findAny() operation is explicitly non-deterministic i.e, it is free to select any element in the stream. 
 * Multiple invocations on the same source may not return the same result.
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamFindAnyExample31 {
	
	public static void main(String[] args) {
		// Using Stream findAny().  
	    // Executing the source code multiple times 
	    // may not return the same result. 
	    // Every time you may get a different  
	    // Integer which is divisible by 4. 
		OptionalInt answer = IntStream.range(1, 15)
				                            .filter(value->value%4==0)
				                            .findAny();
		
		//Note about OptionalInt
        //OptionalInt help us to create an object which may or may not contain a int value. 
        //The getAsInt() method returns value If a value is present in OptionalInt object, otherwise throws NoSuchElementException.
		
		answer.ifPresent(System.out::print);
	}

}
