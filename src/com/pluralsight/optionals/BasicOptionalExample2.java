package com.pluralsight.optionals;

import java.util.Optional;

/**
 * 1. To avoid abnormal termination we use Optional class
 * 2. Optional is a container object which may or may not have a non null value
 * 3. if a value is present isPresent() will return true
 * 4. get() will return the value
 * 5.  
 * 
 * @author DebasishM2
 *
 */

public class BasicOptionalExample2 {
	public static void main(String[] args) {
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		checkNull.ifPresent(System.out::print);
		         
	}
}
