package com.durga.stream;

import java.util.stream.Stream;

public class StreamIterationExample9 {
	public static void main(String[] args) {
		Stream.iterate(1, ele->ele+1)
		.filter(element ->(element%5) ==0)
		.limit(5)
		.forEach(System.out::println);
	}
}
