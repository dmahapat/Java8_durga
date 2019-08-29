package com.durga.stream;

import java.util.stream.IntStream;

//Implementation of reduce method 
//to get the product of all numbers 
//in given range. 
public class StreamReduceExample14 {
	public static void main(String[] args) {
		// To get the product of all elements 
        // in given range excluding the 
        // rightmost element
		int product = IntStream.range(2, 8)
				               .reduce((num1,num2)-> num1*num2)
				               .orElse(-1);
		System.out.println("The product is: "+product);
	}
}
