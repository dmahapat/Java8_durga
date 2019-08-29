package com.durga.stream;

import java.util.Arrays;
import java.util.Optional;

public class StreamReduceExample12 {
	
	public static void main(String[] args) {
		String[] array = {"Be", "yourself", "everyone", "else", "is", "already", "taken"};
		// The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty.
		
		Optional<String> string_combine = Arrays.stream(array) 
                .reduce((str1, str2) -> str1 + "-" + str2);
		string_combine.ifPresent(System.out::println);
		
		
	}

}
