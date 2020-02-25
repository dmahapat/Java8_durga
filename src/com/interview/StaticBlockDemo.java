package com.interview;


/*
 * - static blocks are executed before constructors
 * - This code inside static block is executed only once: 
 *   the first time you make an object of that class or the first time you 
 *   access a static member of that class 
 *   (even if you never make an object of that class).
 * 
 */
public class StaticBlockDemo {
	public static void main(String[] args) {
		System.out.println(Test1.i);
	}

}

class Test1{
	static int i;
	int j;
	
	static {
		i=10;
		System.out.println("Static block called");
	}
}
