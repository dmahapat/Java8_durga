package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MappingExample14 {
	public static void main(String[] args) {
		List<EmployeeMaster> asList = Arrays.asList(new EmployeeMaster("Tom Jones", 45),
			      new EmployeeMaster("Harry Andrews", 45),
			      new EmployeeMaster("Ethan Hardy", 65),
			      new EmployeeMaster("Nancy Smith", 22),
			      new EmployeeMaster("Deborah Sprightly", 29));
		Optional<Integer> maxAge = asList.stream()
		      .collect(Collectors.mapping(EmployeeMaster::getAge, Collectors.maxBy(Integer::compareTo)));
		System.out.println("Buddha in the group is: "+maxAge.get());	      
	}

}
