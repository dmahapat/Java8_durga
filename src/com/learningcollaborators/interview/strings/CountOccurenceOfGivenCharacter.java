package com.learningcollaborators.interview.strings;

import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurenceOfGivenCharacter {
	
	public static BiFunction<String, Character, Long> findOccurence = (givenString,character) -> {
		int res = 0;
		Matcher matcher = Pattern.compile(String.valueOf(character)).matcher(givenString);
		while (matcher.find()) {
			res++;
		}	
		return (long) res;
	};
	
	
	
	public static void main(String[] args) {
		//ignoring case is not taken care of
		String str = "Debasishdddd";
		Character c = 'D';
		System.out.println(findOccurence.apply(str, c));
		
		long count = str.chars().parallel().filter(ele -> (ele == c)).count();
		System.out.println("Count of \""+c+"\" in \""+str+"\" is :"+count);
	}

}
