package com.oops.objectsandclass;
/**
 * 
 * 1. An object in java is a physical as well as a logical entity,
 *    where as a class is a logical entity only.
 * 2. An object has three characteristics:

	  State: represents the data (value) of an object.
      Behavior: represents the behavior (functionality) of an object such as 
      deposit, withdraw, etc.
      Identity: An object identity is typically implemented via a unique ID. 
      The value of the ID is not visible to the external user. 
      However, it is used internally by the JVM to identify each object uniquely.
      
      For Example, Pen is an object. 
      Its name is Reynolds; color is white, known as its state. 
      It is used to write, so writing is its behavior.

	  An object is an instance of a class. A class is a template or blueprint 
	  from which objects are created. So, an object is the instance(result) of a 
	  class.
	  
	  Object Definitions:

	  An object is a real-world entity.
	  An object is a runtime entity.
	  The object is an entity which has state and behavior.
	  The object is an instance of a class.
	  
	  A class in Java can contain:

	  Fields
	  Methods
	  Constructors
	  Blocks
	  Nested class and interface
	  
	  Instance variable in Java:
	  
	  1. variable created inside class but outside method
	  2. does not get memory at compile time
	  3. gets memory at runtime,when object or instance is created
	  4. hence called a instance variable
	  
	  Method in java:
	  
	  1. used to expose behavior of object
	  2. code reusability 
	  3. code optimization
	  
	  new keyword:
	  
	  1. used to allocate memory at runtime
	  2. all objects get memory in heap area
	  
 * 
 * 
 * @author DebasishM2
 *
 */
public class ObjectClassExample1 {
	int id;
	String name;
	
	public static void main(String[] args) {
		ObjectClassExample1 classExample1 = new ObjectClassExample1();
		System.out.println(classExample1.id); // default value 0
		System.out.println(classExample1.name); // default value null
	}
}
