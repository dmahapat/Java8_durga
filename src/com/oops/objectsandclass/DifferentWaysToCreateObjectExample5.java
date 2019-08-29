package com.oops.objectsandclass;

/**
 * Ways are:
 * 	1. By new keyword
 *  2. By new instance method
 *  3. By clone method
 *  4. By deserialization
 *  5. By factory method

 * @author DebasishM2
 * 
 * 
 * Anonymous object
	Anonymous simply means nameless. 
	An object which has no reference is known as an anonymous object. 
	It can be used at the time of object creation only.

	If you have to use an object only once, an anonymous object is a 
	good approach. For example:
	
	normal way:
	
	Calculation c=new Calculation();  
	c.fact(5);
	
	anonymous way:
	
	new Calculation().fact(5);   
 *
 */

class Calculation{  
	 void fact(int  n){  
	  int fact=1;  
	  for(int i=1;i<=n;i++){  
	   fact=fact*i;  
	  }  
	 System.out.println("factorial is "+fact);  
	} 
}
public class DifferentWaysToCreateObjectExample5 {
	
	public static void main(String[] args) {
		new Calculation().fact(5);
		
		// Creating multiple objects of single type:
		// Primitives: int a =20,b=20;
		Calculation calculation = new Calculation(),calculation2 = new Calculation();
		calculation.fact(4);
		calculation2.fact(9);
	}

}
