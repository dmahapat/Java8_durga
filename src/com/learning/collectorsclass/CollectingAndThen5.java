package com.learning.collectorsclass;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. The collectingAndThen(Collector downstream, Function finisher) method of class collectors in Java, 
 *    which adopts Collector so that we can perform an additional finishing transformation.
 * 2. public static<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)
 * 
 *    where
 *    a. 1st input parameter is downstream which is an instance of a Collector<T,A,R> i.e. the standard definition of a collector. 
 *       In other words, any collector can be used here.
 *    b. 2nd input parameter is finisher which needs to be an instance of a Function<R,RR> functional interface. 
 *    This function instance takes as input an object of type R which is the output from downstream collector, 
 *    and it returns an output of type RR which is the final return type of collectingAndThen collector as well.
     – output is a Collector with finisher(return type) of type RR.
     
     How the Collectors.collectingAndThen() method works
     CollectingAndThen() method first collects the elements of type T of Stream<T> using the Collector<T,A,R> passed to it as the first parameter. 
     As a result of applying the collector, stream elements are collected into an object of type R. Using the Function<R,RR> instance passed as the 
     second parameter, the collected object of type R is then transformed to an object of type RR. This object of type RR is the final object/value 
     returned by the collectingAndThen collector.
 * 
 * 
 * @author DebasishM2
 *
 */
class EmployeeT {
	String name;
	Integer age;
	Float salary;
	public EmployeeT(String name, Integer age, Float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
}
public class CollectingAndThen5 {
	public static void main(String[] args) {
		List<EmployeeT> employeeList
	      = Arrays.asList(new EmployeeT("Tom Jones", 45, 15000.00f),
	      new EmployeeT("Tom Jones", 45, 7000.00f),
	      new EmployeeT("Ethan Hardy", 65, 8000.00f),
	      new EmployeeT("Nancy Smith", 22, 10000.00f),
	      new EmployeeT("Deborah Sprightly", 29, 9000.00f));
		
		String maxSalariedEmp = employeeList.stream()
		            .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(EmployeeT::getSalary)), emp -> (emp.isPresent() ? emp.get().getName() : "NOT APPLICABLE")));
		
		System.out.println("Employee with maximum salary: "+maxSalariedEmp);
		
		String averageSalary = employeeList.stream()
		            .collect(Collectors.collectingAndThen(Collectors.averagingDouble(EmployeeT::getSalary), avgVal -> new DecimalFormat("'$'0.00").format(avgVal)));
		System.out.println("Average salary of employess: "+averageSalary);
		
	}
}
