package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 1. Collectors.maxBy()/minBy() methods are defined with the following signatures –

	public static <T> Collector<T, ?, Optional<T>> maxBy(Comparator<? super T> comparator)
	AND
	public static <T> Collector<T, ?, Optional<T>> minBy(Comparator<? super T> comparator)
 * 
 * 2. Where,
     – input parameter is an instance of Comparator of type T
     – output is a Collector, acting on a Stream of elements of type T, with its finisher returning the maximum(for maxBy()) or minimum(for minBy()) value 
       from all the elements of the stream as an Optional value
       
    The predefined collectors returned by Collectors class’ maxBy()/minBy() methods get the maximum/minimum elements in the stream on which they are 
    invoked using the Stream.collect() method. The max/min value is returned as an Optional value. This is because in case the stream has no elements then 
    to avoid sending a bare null value which can result in a NullPointerException, the value is sent as an Optional.   
 * 
 * 3. These are terminal operations
 * 
 * @author DebasishM2
 *
 */
class EmployeeTest {
	String name;
	Integer age;
	Float salary;
	public EmployeeTest(String name, Integer age, Float salary) {
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
public class MaxByMinBy5 {
	
	public static void main(String[] args) {
		List<EmployeeTest> employees = Arrays.asList(new EmployeeTest("Tom Jones", 45, 15000.00f),
		          new EmployeeTest("Tom Jones", 45, 7000.00f),
		          new EmployeeTest("Ethan Hardy", 65, 8000.00f),
		          new EmployeeTest("Nancy Smith", 22, 10000.00f),
		          new EmployeeTest("Deborah Sprightly", 29, 9000.00f));
		
		Optional<EmployeeTest> maxSalaryEmp = employees.stream()
				                                       .collect(Collectors.maxBy(Comparator.comparing(EmployeeTest::getSalary)));
		System.out.println("Employee with maximum salary: "+(maxSalaryEmp.isPresent() ? maxSalaryEmp.get():"NOT APPLICABLE"));
		
		Optional<EmployeeTest> minAgeEmp = employees.stream()
													.collect(Collectors.minBy(Comparator.comparing(EmployeeTest::getAge)));
		System.out.println("Youngest employee: "+(minAgeEmp.isPresent()? minAgeEmp.get() : "NOT APPLICABLE"));
		
	}

}
