package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 1. Whereas the 1st variant always returned a List containing the elements of a group, 
 *    the 2nd variant of grouping collector provides the flexibility to specify how the grouped elements need to be collected, 
 *    the 3rd variant adds the capability to specify how the Map which holds the result is created. 
 *    So, using the 3rd variant of grouping Collector it can be specified whether the resultant Map containing the grouped values is a HashMap or a TreeMap, 
 *    or some user specified type of Map.
 * 2. The 3rd variant of grouping collector is defined with the following signature –
      Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream) 
      Where,
     – 1st input parameter is classifier which is an instance of a Function functional interface which converts from type T to type K.
     – 2nd input parameter is Supplier<M> which is a factory supplying Maps of type M.
     - 3rd input parameter is downstream collector which collects the grouped elements into type D, where D is the specified finisher.
     – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘K, D’  
 *    
 * Concurrent versions of grouping collector
   We saw three groupingBy() method variants above which are good but not optimized for concurrent execution. 
   In case you want to execute grouping collectors in a concurrent manner in a multi-threaded execution environment, 
   then you can utilize the three overloaded methods in java.util.stream.Collectors class all of whom are named groupingByConcurrent(). 
   These three concurrent methods have exactly the same signature as their non-concurrent counterparts – 
   the same input parameters and the same return types respectively – their usage, apart from being used in concurrent contexts, 
   is exactly the same as described above.
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class GroupingByVariant3Example9 {
	
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
		
		TreeMap<DepartmentGroupBy1, Set<EmployeeGroupBy1>> collect = emBy1s.stream()
		      .collect(Collectors.groupingBy(EmployeeGroupBy1::getDepartment,TreeMap::new,Collectors.toSet()));
		
		System.out.println("Grouped by departments : "+ collect);
		
	}

}
