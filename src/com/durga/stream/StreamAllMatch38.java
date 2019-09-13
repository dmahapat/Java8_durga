package com.durga.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 1. Stream allMatch(Predicate predicate) returns whether all elements of 
 *    this stream match the provided predicate.
 * 2. It may not evaluate the predicate on all elements if not necessary for determining the result
 * 3. This is a short-circuiting terminal operation. 
 *    A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.   
 * 
 * Syntax:
 * boolean allMatch(Predicate<? super T> predicate)

	Where, T is the type of the input to the predicate
	and the function returns true if either all elements
	of the stream match the provided predicate or 
	the stream is empty, otherwise false.
 * 
 * 
 * @author DebasishM2
 *
 */


public class StreamAllMatch38 {
	
	// Java code for Stream allMatch 
	// (Predicate predicate) to check whether  
	// all elements of this stream match  
	// the provided predicate. 
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3,6,9,12,15);
		
		boolean answer = integers.stream().allMatch(ele->(ele%3==0));
		
		System.out.println("Is each element divisible by 3:"+answer);
		
		List<Integer> integers1 = Arrays.asList(2,3,6,9,12,15);
		
		boolean answer1 = integers1.stream().allMatch(ele->(ele%3==0));
		
		System.out.println("Is each element divisible by 3:"+answer1);
	}
}
