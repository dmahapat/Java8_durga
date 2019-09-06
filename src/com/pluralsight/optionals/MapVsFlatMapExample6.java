package com.pluralsight.optionals;

import java.util.Optional;

/**
 * 
 * What's the difference between these two methods: 
 * Optional.flatMap() and Optional.map()?
 * @author DebasishM2
 *
 */

public class MapVsFlatMapExample6 {
	
	public static void main(String[] args) {
		// USE map() - if the function returns the object you need
		// USE flatMap() - if the function returns an Optional
		
		Optional<String> s = Optional.of("input");
		System.out.println(s.map(MapVsFlatMapExample6::getOutput));
		System.out.println(s.flatMap(MapVsFlatMapExample6::getOutputOpt));
	}
	
	static String getOutput(String input) {
		return input == null ? null : "output for " + input;
	}

	static Optional<String> getOutputOpt(String input) {
		return input == null ? Optional.empty() : Optional.of("output for " + input);
	}

}
