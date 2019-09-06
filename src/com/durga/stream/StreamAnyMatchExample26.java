package com.durga.stream;

import java.util.stream.Stream;

public class StreamAnyMatchExample26 {
	
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Oliver", "harry", 
                "George", "noah");
		// Check if Character at 1st index is 
        // UpperCase in any string or not using 
        // Stream anyMatch(Predicate predicate) 
		boolean answer = stringStream.anyMatch(val->Character.isUpperCase(val.charAt(0)));
		System.out.println("IS FIRST CHARACTER IN UPPERCASE IN ANYSTRING?????:"+answer);
		  
	}

}
