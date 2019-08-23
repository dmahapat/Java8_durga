package com.interview;
class Base {
	void print() {
		System.out.println("2+3");
	}
}


public class Derived extends Base{
	void print() {
		System.out.println("2-3");
	}
	
	public static void main(String[] args) {
		
		int[][][] a = {{{1,2,3,4},{1,2,3,4}},
				{{1,2,3,4},{1,2,3,4}},
				{{1,2,3,4},{1,2,3,4}}};

		System.out.println(a.length+ "" +a[0].length + "" +a[1].length + "" + a[2].length);
		}
	}

