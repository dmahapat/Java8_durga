package com.oops.objectsandclass;
/**
 * 
 * In real time development, we create classes and use it from another class. 
 * It is a better approach than previous one. Let's see a simple example, 
 * where we are having main() method in another class.
 * 
 * @author DebasishM2
 *
 */
class Student {
	int id;
	String name;
}


public class MainMethodOutsideClassExample2 {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.id);
		System.out.println(student.name);
	}
}
