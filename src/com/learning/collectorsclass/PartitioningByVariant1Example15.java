package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. Syntax:
 *    Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
 *    Where,
     – input is predicate which is an instance of a Predicate Functional Interface of type T
     – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘Boolean, List<T>’
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class PartitioningByVariant1Example15 {
	public static void main(String[] args) {
		List<EmployeeMaster> employeeList = Arrays.asList(new EmployeeMaster("Tom Jones", 45),
			      new EmployeeMaster("Harry Major", 26),
			      new EmployeeMaster("Ethan Hardy", 65),
			      new EmployeeMaster("Nancy Smith", 22),
			      new EmployeeMaster("Catherine Jones", 21),
			      new EmployeeMaster("James Elliot", 58),
			      new EmployeeMaster("Frank Anthony", 55),
			      new EmployeeMaster("Michael Reeves", 40));
		
		Map<Boolean, List<EmployeeMaster>> collect = employeeList.stream()
		            .collect(Collectors.partitioningBy((EmployeeMaster empMaster)-> empMaster.getAge()>30));
		System.out.println(collect);
		
	}

}
