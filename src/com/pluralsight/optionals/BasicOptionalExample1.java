package com.pluralsight.optionals;

/**
 * 1. Every Java programmer is familiar with NullPointerException
 * 2. very hard to avoid without too many null checks
 * 3. Java 8 has introduced a new class Optional in java.util package.
 * 4. It can help write a neat code without using too many null checks
 * 5. By using Optional, we can specify alternate values to return or alternate code to run.
 * 6. This makes the code more readable because the facts which were hidden are now visible 
 *    to the developer.
 * 
 * Advantages of Java 8 Optional:

	Null checks are not required.
	No more NullPointerException at run-time.
	We can develop clean and neat APIs.
	No more Boiler plate code
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */


public class BasicOptionalExample1 {
	public static void main(String[] args) {
		String[] words = new String[10];   
        String word = words[5].toLowerCase();   
        System.out.print(word); 
	}

}
