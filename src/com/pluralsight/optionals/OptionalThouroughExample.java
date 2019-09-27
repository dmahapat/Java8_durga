package com.pluralsight.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalThouroughExample {
	
	public static void main(String[] args) {
//		The isPresent() method returns true if this instance of Optional has non-null value and false otherwise.
//		The orElseGet() method provides the fallback mechanism in case Optional has null value by accepting 
//		the function to generate the default one. 
//		The map() method transforms the current Optional’s value and returns the new Optional instance. 
//		The orElse() method is similar to orElseGet() but instead of function it accepts the default value.
		
		/*Optional<String> fullName = Optional.ofNullable(null);
		System.out.println("full name is set? "+fullName.isPresent());
		System.out.println("full name (orElseGet()):" +fullName.orElseGet(()->"NONE"));
		System.out.println("full name (orElse()):" +fullName.orElse("NONE"));
		System.out.println(fullName.map(s->"Hey "+s+"!").orElse("Hey Stranger!"));
		
		
		Optional<String> firstName = Optional.of("JOE");
		System.out.println("firstName is set? "+firstName.isPresent());
		System.out.println("firstName: (orElseGet)"+firstName.orElseGet(()->"NONE"));
		System.out.println("firstName: (orElse)"+firstName.orElse("None"));
		System.out.println(firstName.map(s->"Hey "+s+"!").orElse("Hey Stranger!"));*/
		
		List<String> aList = Arrays.asList("ABC","DEF","CDE");
		Optional<String> findAny = IntStream.rangeClosed(0, aList.size())
				                            .filter(cnt->aList.get(cnt).equalsIgnoreCase("ABC"))
				                            .mapToObj(i->aList.get(i))
				                            .findAny();
		OptionalInt findAny2 = IntStream.rangeClosed(0, aList.size())
        .filter(cnt->aList.get(cnt).equalsIgnoreCase("ABC"))
        .findAny();
		System.out.println(findAny2.getAsInt());
		
		findAny.ifPresent(System.out::print);		
		
		
		
		
		
	}

}
