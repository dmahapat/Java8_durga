package com.durga.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 1. Stream anyMatch(Predicate predicate) returns whether any 
 *    elements of this stream matches the provided predicate.
 * 2. It may not evaluate the predicate on all elements if not 
 *    necessary for determining the result.
 * 3. This is a short-circuiting terminal operation. A terminal operation is 
 *    short-circuiting if, when presented with infinite input, it may terminate in finite time.
 * 4. Syntax:
 *    boolean anyMatch(Predicate<? super T> predicate)

	Where, T is the type of the input to the predicate
	and the function returns true if any elements of
	the stream match the provided predicate, 
	otherwise false.
 * 
 * 5. If the stream is empty then false is returned and the predicate is not evaluated.
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamAnyMatchExample25 {
	
	public static void main(String[] args) {
		// Java code for Stream anyMatch 
		// (Predicate predicate) to check whether  
		// any element of this stream match  
		// the provided predicate.
		List<Integer> list = Arrays.asList(3,4,6,12,20);
		boolean answer = list.stream().anyMatch(val->val%2==0);
		System.out.println("EVEN NUMBERS PRESENT????? : "+answer);
	}

}
