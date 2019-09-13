package com.learning.collectorsclass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 1. Collectors averagingInt(ToIntFunction<? super T> mapper) method is used to find the mean of the integers passed in the parameters. 
 *    This method returns a Collector that produces the arithmetic mean of an integer-valued function applied to the input elements. 
 *    If no elements are passed as the input elements, then this method returns 0.
 *    
 * 2. Syntax:
 *    public static 
      <T> Collector<T, ?, Double> 
      averagingInt(ToIntFunction<? super T> mapper)
        
 * 3. Interface Collector<T, A, R>: A mutable reduction operation that accumulates input elements into a mutable result container, optionally transforming the accumulated result into a final representation after all input elements have been processed. Reduction operations can be performed either sequentially or in parallel.
		T: The type of input elements to the reduction operation.
		A: The mutable accumulation type of the reduction operation.
		R: The result type of the reduction operation.
 * 4. Double: The Double class wraps a value of the primitive type double in an object. An object of type Double contains a single field whose type is double.
	  ToIntFunction: Represents a function that produces an int-valued result.
 * 
 * @author DebasishM2
 *
 */
public class CollectorsAveragingInt4 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("3","4","5");
		double result = stream.collect(Collectors.averagingInt(val->Integer.parseInt(val)));
		System.out.println("The average of the above stream is :"+result);
		
		
		Stream<String> emptyStream = Stream.of();
		double emptyStreamResult = emptyStream.collect(Collectors.averagingInt(val->Integer.parseInt(val)));
		System.out.println("The average of the above emptyStream is :"+emptyStreamResult);
		
	}

}
