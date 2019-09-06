package com.durga.stream;

import java.util.stream.Stream;

//To print the characters at index 2 of string array in original 
//order
public class StreamForEachOrdered36 {
	public static void main(String[] args) {
		//Creating a Stream of Strings
		Stream<String> oceans = Stream.of("Atlantic","Arctic","Indian","Pacific","Southern");
		
		oceans.flatMap(ocean->Stream.of(ocean.charAt(2)))
		      .forEachOrdered(System.out::println);
	}
}
