package com.durga.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap35 {
	
	public static void main(String[] args) {
		String[][] dataArray = new String[][] {{"a","b"},{"c","d"},{"e","f"},{"g","h"}};
		
		List<String> allCharacters = Stream.of(dataArray)
				                           .flatMap(array->Arrays.stream(array))
				                           .collect(Collectors.toList());
		System.out.println("ALL CHARACTERS:" + allCharacters);
	}

}
