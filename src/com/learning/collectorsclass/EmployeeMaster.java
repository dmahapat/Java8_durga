package com.learning.collectorsclass;

public class EmployeeMaster {
	  private String name;
	  private Integer age;
	 
	  public EmployeeMaster(String name, Integer age) {
	    this.name = name;
	    this.age = age;
	  }
	 
	  //Getters and Setters of name & age go here
	  public String toString(){
	    return "Employee Name:"+this.name
	        +"  Age:"+this.age;
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
}
