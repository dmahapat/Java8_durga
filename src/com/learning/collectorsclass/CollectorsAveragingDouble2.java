package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 1. Collectors averagingDouble(ToDoubleFunction<? super T> mapper) method is used to find the 
 *    mean of the double values passed in the parameters.
 * 2. This method returns a Collector that produces the arithmetic mean of an double-valued function applied to the input elements. 
 *    If no elements are passed as the input elements, then this method returns 0.
 * 3. Syntax:
 *    public static <T> Collector<T, ?, Double> averagingDouble(ToDoubleFunction<? super T> mapper)   
 * 4. Interface Collector<T, A, R>: A mutable reduction operation that accumulates input elements into a mutable result container, optionally transforming the accumulated result into a final representation after all input elements have been processed. Reduction operations can be performed either sequentially or in parallel.
		T: The type of input elements to the reduction operation.
		A: The mutable accumulation type of the reduction operation.
		R: The result type of the reduction operation
 * 5. Double: The Double class wraps a value of the primitive type double in an object. 
 *            An object of type Double contains a single field whose type is double.
   6. ToDoubleFunction: Represents a function that produces a double-valued result.
 * 
 * 
 * @author DebasishM2
 *
 */
public class CollectorsAveragingDouble2 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("3","4","5");
		double answer = stream.collect(Collectors.averagingDouble(val->Double.parseDouble(val)));
		
		System.out.println("The average is :" + answer);
		
		Stream<String> stream2 = Stream.of();
		double answer1 = stream2.collect(Collectors.averagingDouble(val->Double.parseDouble(val)));
		System.out.println("Average of an empty stream is :"+answer1);
		
	}

}
