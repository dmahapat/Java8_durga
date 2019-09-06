package com.durga.stream;

import java.util.stream.Stream;

/**
 * 1. Stream noneMatch(Predicate predicate) returns whether 
 *    no elements of this stream match the provided predicate.
 * 2. It may not evaluate the predicate on all elements if not necessary 
 *    for determining the result.
 * 3. This is a short-circuiting terminal operation. A terminal operation is short-circuiting
 *    if, when presented with infinite input, it may terminate in finite time.    
 * 4. Syntax
 *    boolean noneMatch(Predicate<? super T> predicate)

		Where, T is the type of the input to the predicate
		and the function returns true if either no elements 
		of the stream match the provided predicate or the
		stream is empty, otherwise false.
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamNoneMatchExample27 {
	
	//To check that there is no string of length 4.
	public static void main(String[] args) {
		Stream<String> streamOfStrings = Stream.of("Olivia","Amelia","Ava","Isabella");
		boolean answer = streamOfStrings.noneMatch(str->(str.length()==4));
		System.out.println("Is any string in the list has length 4????"+answer);
 	}

}
