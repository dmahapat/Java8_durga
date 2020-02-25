package com.interview.stackimplementationwithlinkedlist;

public class Application {
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		
		System.out.println("Peek when stack is empty: "+myStack.peek());
		
		myStack.push(10);
		
		System.out.println("Peek after 10 is pushed: "+myStack.peek());
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		
		System.out.println("Size: "+myStack.size());
		System.out.println("Pop: "+myStack.pop());
		System.out.println("Pop: "+myStack.pop());
		System.out.println("Pop: "+myStack.pop());
//LIFO structure
		System.out.println("Size: "+myStack.size());
	}

}
