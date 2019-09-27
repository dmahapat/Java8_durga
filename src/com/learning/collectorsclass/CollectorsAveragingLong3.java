package com.learning.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeKlass {
	String name;
	Integer age;
	Double salary;
	long leaves;
	public EmployeeKlass(String name, Integer age, Double salary, long leaves) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.leaves = leaves;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public long getLeaves() {
		return leaves;
	}

	public void setLeaves(long leaves) {
		this.leaves = leaves;
	}

	@Override
	public String toString() {
		return "EmployeeKlass [name=" + name + ", age=" + age + ", salary=" + salary + ", leaves=" + leaves + "]";
	}
	
	
}
public class CollectorsAveragingLong3 {
	public static void main(String[] args) {
		List<EmployeeKlass> emKlasses = Arrays.asList(new EmployeeKlass("TOM Jones", 45, 15000.00, 190),
				new EmployeeKlass("Tom Jones", 45, 7000.00,220),
			      new EmployeeKlass("Ethan Hardy", 65, 8000.00,1008),
			      new EmployeeKlass("Nancy Smith", 22, 10000.00,5),
			      new EmployeeKlass("Deborah Sprightly", 29, 9000.00,45));
		
		// Using Collectors.averagingInt()
		Double aveargeAge = emKlasses.stream()
				                     .collect(Collectors.averagingInt(EmployeeKlass::getAge));
		
		System.out.println("Average age of employess: "+aveargeAge);
		
		Double avgSalary = emKlasses.stream()
				                    .collect(Collectors.averagingDouble(EmployeeKlass::getSalary));
		System.out.println("Average salary of employess: "+avgSalary);
		
		Double avgLeaves = emKlasses.stream()
				                    .collect(Collectors.averagingLong(EmployeeKlass::getLeaves));
		System.out.println("Average leaves of employees: "+avgLeaves);
		
	}
}
