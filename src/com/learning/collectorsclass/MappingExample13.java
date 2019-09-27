package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Syntax:
 * public static <T, U, A, R> Collector<T, ?, R>
   mapping(Function<? super T,? extends U> mapper,Collector<? super U,A,R> downstream)
   
   Where,
     – 1st input parameter is mapper an instance of Function functional interface, which converts stream elements of type T to type U
     – 2nd input parameter is downstream an instance of a standard collector which collects elements of type U in the result type R
     – output is a Collector which collects elements of type T in the result type R.
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */

public class MappingExample13 {
	public static void main(String[] args) {
		
	      List<EmployeeMaster> asList = Arrays.asList(new EmployeeMaster("Tom Jones", 45),
	      new EmployeeMaster("Harry Andrews", 45),
	      new EmployeeMaster("Ethan Hardy", 65),
	      new EmployeeMaster("Nancy Smith", 22),
	      new EmployeeMaster("Deborah Sprightly", 29));
	      
	      List<String> empNameList = asList.stream()
	            .collect(mapping(EmployeeMaster::getName, toList()));
	      System.out.println("Employee list: "+asList);
	      System.out.println("Employee name list: "+empNameList);
	      Set<String> empNameSet = asList.stream()
	            .collect(mapping(EmployeeMaster::getName, toSet()));
	      System.out.println("Employee name set: "+empNameSet);
	}
}
