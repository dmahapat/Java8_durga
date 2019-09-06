package com.durga.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Implementation of Stream.max() 
//to get the maximum element 
//of the Stream according to the 
//provided Comparator.
public class StreamMaxMethodExample17 {
	public static void main(String[] args) {
		// Creating a list of integers 
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // Here, the smallest element in list 
        // will be stored in variable smallestElem 
        Optional<Integer> smallestElem = list.stream() 
                     .max(Comparator.reverseOrder()); 
        smallestElem.ifPresent(System.out::print);
  
	}
}
