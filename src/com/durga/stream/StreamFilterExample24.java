package com.durga.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * 1. Java stream provides a method filter() to 
 *    filter stream elements on the basis of given predicate.
 * 2. This method takes predicate as an argument and returns a 
 *    stream of consisting of resulted elements.
 * 3. signature of Stream filter():
 *    Stream<T> filter(Predicate<? super T> predicate) 
 * 4.       
 * 
 * @author DebasishM2
 *
 */
public class StreamFilterExample24 {
	public static void main(String[] args) {
		
		List<Integer> primeList = IntStream.range(1, 101).filter(num -> {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}).mapToObj(Integer::valueOf)
		  .collect(Collectors.toList());
		System.out.println(primeList);    
    // we can use boxed() instead of mapToObj()
		
		int maxNumber = Arrays.asList(3,7,10,-2,-15,125).stream().max((n1,n2)-> n1>n2?1:(n1 == n2)? 0: -1).get();
		
		System.out.println(maxNumber);
	}
}
