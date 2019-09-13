package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Collectors toCollection(Supplier<C> collectionFactory) method in Java is used to create a Collection using Collector. 
 *    It returns a Collector that accumulates the input elements into a new Collection, in the order in which they are passed.
 * 2. Syntax:
 *    public static <T, C extends Collection<T>> Collector<T, ?, C>
      toCollection(Supplier<C> collectionFactory)
   3. collectionFactory : A Supplier which returns a new, empty Collection of the appropriate type.  
 * 
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
class Employee {
	String name;
	Integer age;
	Float salary;
	public Employee(String name, Integer age, Float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}


public class CollectorsToCollectionExample1 {
	
	public static void main(String[] args) {
		// Creating a string stream
		
		Stream<String> stream = Stream.of("William","John","James","Jacob");
		
		Collection<String> collection = stream.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(collection);
		
		List<Employee> emList = Arrays.asList(new Employee("Tom Jones", 45, 7000.00f),
			      new Employee("Ethan Hardy", 65, 8000.00f),
			      new Employee("Nancy Smith", 22, 10000.00f),
			      new Employee("Deborah Sprightly", 29, 9000.00f));
		
		LinkedList<Employee> emLinkedList = emList.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println(emLinkedList);
		
		HashSet<Employee> emHashSet = emList.stream().collect(Collectors.toCollection(HashSet::new));
	}

}
