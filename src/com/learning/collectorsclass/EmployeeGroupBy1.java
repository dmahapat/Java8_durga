package com.learning.collectorsclass;

public class EmployeeGroupBy1 {
	private String name;
	  private Integer age;
	  private Double salary;
	  private DepartmentGroupBy1 department;
	 
	  public EmployeeGroupBy1(String name, Integer age, Double salary, DepartmentGroupBy1 department) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	    this.department = department;
	  }
	 
	  // Setters/Getters for name,age,salary,department go here
	 
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

	public DepartmentGroupBy1 getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentGroupBy1 department) {
		this.department = department;
	}

	public String toString(){
	    return "Employee Name:"+this.name;
	  }
}
