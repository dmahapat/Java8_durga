package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1.The simplest of Collectors.groupingBy() method variants is defined with the following signature –
     public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier)
 * 2. Where,
     – input is classifier which is an instance of a Function functional interface which converts from type T to type K.
   3. – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘K, List<T>’  
 * 
 * @author DebasishM2
 *
 */
public class GroupingByVariant1Example7 {
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
		
		
		Map<DepartmentGroupBy1, List<EmployeeGroupBy1>> groupedByDepartments = emBy1s.stream()
		      .collect(Collectors.groupingBy(EmployeeGroupBy1::getDepartment));
		
		System.out.println(groupedByDepartments);
	}
}
