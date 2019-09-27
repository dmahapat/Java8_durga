package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1. Whereas the 1st variant always returned a List containing the elements of a group, 
 *    the 2nd variant of grouping collector provides the flexibility to specify how the grouped elements 
 *    need to be collected using a second parameter which is a Collector. 
 *    So, instead of just storing the groups in resultant Map as Lists, we can instead store them in say Sets, 
 *    or find the maximum value in each group and store it rather than storing all the elements of a group, 
 *    or any such collector operation which is applicable on the stream elements.
 * 2. Syntax:
 *    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream) 
	  Where,
     – 1st input parameter is classifier which is an instance of a Function functional interface which converts from type T to type K.
     – 2nd input parameter is downstream collector which collects the grouped elements into type D, where D is the specified finisher.
     – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘K, D  
 *    
 * 
 * 
 * @author DebasishM2
 *
 */
public class GroupingByVariant2Example8 {
	
	public static void main(String[] args) {
		List<EmployeeGroupBy1> emBy1s = Arrays.asList(
			      new EmployeeGroupBy1("Tom Jones", 45, 12000.00,DepartmentGroupBy1.MARKETING),
			      new EmployeeGroupBy1("Harry Major", 26, 20000.00, DepartmentGroupBy1.LEGAL),
			      new EmployeeGroupBy1("Ethan Hardy", 65, 30000.00, DepartmentGroupBy1.LEGAL),
			      new EmployeeGroupBy1("Nancy Smith", 22, 15000.00, DepartmentGroupBy1.MARKETING),
			      new EmployeeGroupBy1("Catherine Jones", 21, 18000.00, DepartmentGroupBy1.HR),
			      new EmployeeGroupBy1("James Elliot", 58, 24000.00, DepartmentGroupBy1.OPERATIONS),
			      new EmployeeGroupBy1("Frank Anthony", 55, 32000.00, DepartmentGroupBy1.MARKETING),
			      new EmployeeGroupBy1("Michael Reeves", 40, 45000.00, DepartmentGroupBy1.OPERATIONS));
		
		Map<DepartmentGroupBy1, Set<EmployeeGroupBy1>> groupedByInASet = 
				emBy1s.stream().collect(Collectors.groupingBy(EmployeeGroupBy1::getDepartment,Collectors.toSet()));
		System.out.println(groupedByInASet);
		Map<DepartmentGroupBy1, Set<String>> collect = emBy1s.stream()
				                                             .collect(Collectors.groupingBy(EmployeeGroupBy1::getDepartment,Collectors.mapping(EmployeeGroupBy1::getName,Collectors.toSet())));
		
		System.out.println(collect);
	}

}
