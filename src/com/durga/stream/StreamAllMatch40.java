package com.durga.stream;

import java.util.stream.IntStream;

public class StreamAllMatch40 {
	
	public static void main(String[] args) {
		
		final String sample = "Fearlessness is like a muscle";
		
		//converting to ascii
		IntStream intStream = sample.chars();
		
		boolean answer = intStream.allMatch(c->c>100);
		System.out.println(answer);
	}

}
