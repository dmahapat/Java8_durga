package com.pluralsight.optionals;

import java.util.Optional;

public class OptionalFilterMethodExample5 {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyGender = Optional.empty();
		
		//Filter an Optional
		//Optional<T>	filter(Predicate<? super T> predicate)
		//If a value is present, and the value matches the given 
		//predicate, return an Optional describing the value, 
		//otherwise return an empty Optional.
		
		System.out.println(gender.filter(g->g.equals("male")));
		System.out.println(gender.filter(g->g.equalsIgnoreCase("male")));
		System.out.println(emptyGender.filter(g->g.equalsIgnoreCase("male")));
	}
}
