package com.durga.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Stream forEach(Consumer action) performs an action for each element of the stream. 
 * Stream forEach(Consumer action) is a terminal operation i.e, it may traverse the 
 * stream to produce a result or a side-effect.
 * 
 * Syntax:
 * void forEach(Consumer<? super T> action)

	Where, Consumer is a functional interface
	and T is the type of stream elements.
 * 
 * 
 * @author DebasishM2
 *
 */
public class StreamForEach36 {
//To perform print operation on each element of reversely sorted stream.
	public static void main(String[] args) {
		
		//Creating a list of integers
		List<Integer> intList = Arrays.asList(2,4,6,8,10);
		
		// Using forEach(Consumer action) to 
        // print the elements of stream 
        // in reverse order
		intList.stream()
		       .sorted(Comparator.reverseOrder())
		       .forEach(System.out::println);
	}
}
