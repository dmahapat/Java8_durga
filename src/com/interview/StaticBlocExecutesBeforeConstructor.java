package com.interview;

/*
 * - static block gets executed before constructor
 * - even though there are 2 objects created here static block is called only once
 * 
 * 
 */

public class StaticBlocExecutesBeforeConstructor {
	public static void main(String[] args) {
		TestCls t1 = new TestCls(); 
		TestCls t2 = new TestCls(); 
	}
}

class TestCls {
	static int i;
	int j;

	static {
		i = 10;
		System.out.println("Static block called");
	}

	public TestCls() {
		System.out.println("Constructor called");
	}
}
