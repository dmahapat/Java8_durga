package com.interview;

public enum EnumConstructorAndMethod {
	
	RED,GREEN,BLUE;
	
	//enum constructor called for each constant
	private EnumConstructorAndMethod() {
		System.out.println("Constructor called for : "+this.toString());
	}
	
	//only concrete (not abstract) methods are allowed
    public void colorInfo() {
    	System.out.println("Universal Color");
    }
}
