package com.pluralsight.optionals;

import java.util.Optional;

public class OptionalOrElseExample8 {
	
	public static void main(String[] args) {
		
		Optional<String> favColor = Optional.of("RED");
		Optional<String> emptyColor = Optional.empty();
		
		// T	orElse(T other)
		// Return the value if present, otherwise return other.
		System.out.println(favColor.orElse("GREEN"));
		System.out.println(emptyColor.orElse("ALTERNATE VALUE GREEN"));
		
		// T	orElseGet(Supplier<? extends T> other)
		// Return the value if present, otherwise invoke other and return the result of that invocation.
		System.out.println(favColor.orElseGet(()-> "GREEN"));
		System.out.println(emptyColor.orElseGet(()-> "ALTERNATE VALUE GREEN"));
	}

}
