package com.pluralsight.optionals;

import java.util.Optional;

public class OptionalMapAndFlatMapExample4 {
	
	public static void main(String[] args) {
		
		Optional<String> nonEmptyGender = Optional.of("male");
		Optional<String> emptyGender = Optional.empty();
		
		
		// <U> Optional<U>	map(Function<? super T,? extends U> mapper)
		// If a value is present, apply the provided mapping function to it, 
		// and if the result is non-null, return an Optional describing the result.
		System.out.println("Non-Empty Optional:: " +nonEmptyGender.map(String::toUpperCase));
		System.out.println("Empty Optional:: " +emptyGender.map(String::toUpperCase));
		
		Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
		System.out.println("Optional value: "+nonEmptyOptionalGender);
		System.out.println("Optional.map     :: " + nonEmptyOptionalGender.map(gender->gender.map(String::toUpperCase)));
		
		// <U> Optional<U>	flatMap(Function<? super T,Optional<U>> mapper)
		// If a value is present, apply the provided Optional-bearing mapping function to it, return that result, otherwise return an empty Optional.
		System.out.println("Optional.flatMap :: " + nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
		
		
	        
	}

}
