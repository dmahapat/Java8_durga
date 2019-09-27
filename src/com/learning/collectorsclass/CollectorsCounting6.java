package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Collectors.counting() method is defined with the following signature –
      public static <T> Collector<T, ?, Long> counting()
   2. Where,
     – output is a Collector, acting on a Stream of elements of type T, 
     with its finisher returning the ‘collected’ value of type Long   
 * 
 * 
 * @author DebasishM2
 *
 */
public class CollectorsCounting6 {
	public static void main(String[] args) {
		List<EmployeeMaster> employeeList = Arrays.asList(new EmployeeMaster("Tom Jones", 45),
			      new EmployeeMaster("Harry Major", 25),
			      new EmployeeMaster("Ethan Hardy", 65),
			      new EmployeeMaster("Nancy Smith", 22),
			      new EmployeeMaster("Deborah Sprightly", 29));
		
		Long count = employeeList.stream().collect(Collectors.counting());
		System.out.println("Count of all employees: "+count);
		
		Long countOfEmployessAgeGreaterThanThirty = employeeList.stream()
		            .filter(emp->emp.getAge() > 30)
		            .collect(Collectors.counting());
		
		System.out.println("countOfEmployessAgeGreaterThanThirty is : "+countOfEmployessAgeGreaterThanThirty);
		
		Long countOfEmployeesAgeLessThanThirty = employeeList.stream()
		            .filter(emp->emp.getAge()<30)
		            .collect(Collectors.counting());
		System.out.println("countOfEmployeesAgeLessThanThirty: "+countOfEmployeesAgeLessThanThirty);
	}
}
