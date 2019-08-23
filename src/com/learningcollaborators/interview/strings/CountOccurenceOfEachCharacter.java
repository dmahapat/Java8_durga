package com.learningcollaborators.interview.strings;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachCharacter {
	
	public static Consumer<String> getCharacterCount = (givenString) -> {
		
		//Below works but ascii representation of character is shown
		/*Map<Object, Long> charMap = givenString.chars().boxed()
												.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		*/
		Map<Object, Long> charMap = givenString.chars().boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		
		System.out.println("The count of each character in \""+givenString+ "\"  is as follows:\n"+charMap);
		
	};
	
	public static void main(String[] args) {
		getCharacterCount.accept("Debasish");
	}

}
