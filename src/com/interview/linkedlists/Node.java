package com.interview.linkedlists;

public class Node<T extends Comparable> {
	private T data;
	private Node nextNode;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getNext() {
		return nextNode;
	}

	@Override
	public String toString() {
		return "[data=" + data.toString() +"]";
	}

	public void setNext(Node next) {
		this.nextNode = next;
	}
	
}
