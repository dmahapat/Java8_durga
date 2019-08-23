package com.interview;

abstract class MainClassObjectIsNotCreated {
	/*
	 * JVM does not create object of MainClassObjectIsNotCreated
	 * Here the class is abstract, hence no chance of object getting created.
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("HELLO");
	}
}
