package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate,
	Collector<? super T, A, D> downstream)
 * Where,
     - first parameter is predicate which is an instance of a Predicate Functional Interface
     - second parameter is a Collector
     - output is a Collector with finisher(return type) as aMap with entries having ‘key,value’ pairs as ‘Boolean, D>’ where D is the return type of the finisher function of second collector parameter
 * 
 * 
 * @author DebasishM2
 *
 */
public class PartitioningByVariant2Example16 {
	
	public static void main(String[] args) {
		List<EmployeeMaster> employeeList = Arrays.asList(new EmployeeMaster("Tom Jones", 45),
			      new EmployeeMaster("Harry Major", 26),
			      new EmployeeMaster("Ethan Hardy", 65),
			      new EmployeeMaster("Nancy Smith", 22),
			      new EmployeeMaster("Catherine Jones", 21),
			      new EmployeeMaster("James Elliot", 58),
			      new EmployeeMaster("Frank Anthony", 55),
			      new EmployeeMaster("Michael Reeves", 40));
		
		Map<Boolean, Long> collect = employeeList.stream()
		            .collect(partitioningBy((EmployeeMaster empMaster)-> empMaster.getAge()>30,counting()));
		System.out.println(collect);
		Map<Boolean, Set<String>> collect2 = employeeList.stream()
	            .collect(partitioningBy((EmployeeMaster empMaster)-> empMaster.getAge()>30,mapping(EmployeeMaster::getName, toSet())));
		System.out.println("Set of employees: "+collect2);
	}

}
