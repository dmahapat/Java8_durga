package com.interview.linkedlists;

public class Application {
	public static void main(String[] args) {
		
		MyList<Integer> myList = new MyLinkedList<>();
		myList.insert(1);
		myList.insert(2);
		myList.insert(3);
		myList.insert(4);
		myList.insert(5);
		myList.insert(6);
		myList.insert(7);
		myList.insert(8);
		myList.insert(9);
		myList.insert(10);
		/*System.out.println("Original list:\n");
		myList.traverseList();
		System.out.println("\nReversed list:\n");*/
		myList.reverse();
		myList.traverseList();
		System.out.println("Middle node is:\n");
		System.out.println(myList.getMiddleNode());
		
	}
}
