package com.pluralsight.optionals;

import java.util.Optional;

public class OptionalIsPresentAndIfPresent7 {
	
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		
		
		//boolean	isPresent()
		//Return true if there is a value present, otherwise false.
		
		if(gender.isPresent()) {
			System.out.println("Value available.");
		}else {
			System.out.println("Value unavailable.");
		}
		//void	ifPresent(Consumer<? super T> consumer)
		//If a value is present, invoke the specified consumer with the value, otherwise do nothing.
		gender.ifPresent(g->System.out.println("IF PRESENT: "+g));
		
		//condition failed, hence no output 
		emptyGender.ifPresent(System.out::print);
		
	}

}
