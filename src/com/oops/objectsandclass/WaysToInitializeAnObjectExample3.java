package com.oops.objectsandclass;

/**
 * The 3 ways are 1. By reference variable 2. By method 3. By Constructor
 * 
 * @author DebasishM2
 *
 */

class Employee {
	int id;
	String name;
	
	void setValues(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class WaysToInitializeAnObjectExample3 {
	public static void main(String[] args) {
		
		//1. Object initialization through reference
		Employee employee = new Employee();
		employee.id = 10;
		employee.name = "John";
		System.out.println(employee);
		
		//2. Object initialization by method
		Employee employee2 = new Employee();
		employee2.setValues(11, "Sierra");
		System.out.println(employee2);
		
	}
}
