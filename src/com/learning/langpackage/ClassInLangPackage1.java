package com.learning.langpackage;
/**
 * 
 * 1. Java provides a class with name Class in java.lang package.
 * 2. Instances of the class Class represent classes and interfaces in a running Java application.
 * 3. The primitive Java types (boolean, byte, char, short, int, long, float, and double), and the keyword void are also represented as Class objects
 * 4. It has no public constructor. 
 * 5. Class objects are constructed automatically by the Java Virtual Machine(JVM)
 * 6. It is a final class, so we cannot extend it.
 * 7. The Class class methods are widely used in Reflection API.
 * 
 * Creating a Class object:
 * 1. Class.forName(“className”) : Since class Class doesn’t contain any constructor, there is static factory method present in class Class, 
 *    which is Class.forName() , used for creating object of class Class. Below is the syntax 
 *    Class c = Class.forName(String className)
 * 2. Myclass.class : When we write .class after a class name, it references the Class object that represents the given class. 
 *    It is mostly used with primitive data types and only when we know the name of class. 
 *    The class name for which Class object is to be created is determined at compile-time. Below is the syntax :
      Class c = int.class
      
         Please note that this method is used with class name, not with class instances. For example
         A a = new A();   // Any class A
		 Class c = A.class; // No error
		 Class c = a.class; // Error
	3. obj.getClass() : This method is present in Object class. It return the run-time class of this(obj) object. Below is the syntax :
		A a = new A();   // Any class A
		Class c = a.getClass();	  
		
		
		IMPORTANT:
		
		Instances of the class Class represent classes and interfaces in a running Java application. 
		An enum is a kind of class and an annotation is a kind of interface. 
		Every array also belongs to a class that is reflected as a Class object that is shared by all arrays with the same element type and number of dimensions. 
		The primitive Java types (boolean, byte, char, short, int, long, float, and double), and the keyword void are also represented as Class objects.
        Class has no public constructor. Instead Class objects are constructed automatically by the Java Virtual Machine as classes are loaded and by 
        calls to the defineClass method in the class loader.
 * 
 * 
 * @author DebasishM2
 *
 */
public class ClassInLangPackage1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// Java program to demonstrate toString() method
		
		Class c1 = Class.forName("java.lang.String"); 
		Class c2 = int.class;
		Class c3 = void.class;
		
		System.out.println("Class represented by C1:"+c1.toString());
		System.out.println("Class represented by C2:"+c2.toString());
		System.out.println("Class represented by C3:"+c3.toString());
		
		
	}

}
