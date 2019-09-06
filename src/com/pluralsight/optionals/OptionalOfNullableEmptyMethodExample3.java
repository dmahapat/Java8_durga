package com.pluralsight.optionals;

import java.util.Optional;

public class OptionalOfNullableEmptyMethodExample3 {
	
	public static void main(String[] args) {
		
		//of() - Returns an Optional with the specified present non-null value.
		Optional<String> gender = Optional.of("MALE");
		
		String answer1 = "yes";
		String answer2 = null;
		
		System.out.println("Non empty optional: "+gender);
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());
		
		//empty() - Returns an empty Optional instance.
		System.out.println("Empty Optional: " + Optional.empty());
		
		//ofNullable() - 
		//  Returns an Optional describing the specified value, 
		// if non-null, otherwise returns an empty Optional.
		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
		
		
		// java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
		
		//Question: Stackoverflow
		/**
		 * String foobar = <value or null>;
		   Optional.of(foobar);         // May throw NullPointerException
		   Optional.ofNullable(foobar); // Safe from NullPointerException
		 * 
		 * I understand Optional.ofNullable is the only safe way of using Optional, 
		 * but why does Optional.of exist at all? Why not just use Optional.ofNullable and 
		 * be on the safe side at all times?
		 * 
		 * 
		 * Answer:
		 * Your question is based on assumption that the code which may throw 
		 * NullPointerException is worse than the code which may not. 
		 * This assumption is wrong. If you expect that your foobar is never null due to 
		 * the program logic, it's much better to use Optional.of(foobar) as you will see 
		 * a  NullPointerException which will indicate that your program has a bug. 
		 * If you use Optional.ofNullable(foobar) and the foobar happens to be null due to 
		 * the bug, then your program will silently continue working incorrectly, 
		 * which may be a bigger disaster. This way an error may occur much later and it 
		 * would be much harder to understand at which point it went wrong.
		 * 
		 */
	}

}
