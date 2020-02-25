package com.interview.stackimplementationwithlinkedlist;

public class Stack<T extends Comparable> {
	private Node root;
	private int count;
	
	public void push(T data) {
		this.count++;
		if(this.root==null) {
			this.root = new Node(data);
		}else {
			Node oldRoot = this.root;
			this.root = new Node<>(data);
			this.root.setNextNode(oldRoot);
		}
	}
	
	public int size() {
		return this.count;
	}
	
	public boolean isEmpty() {
		return (this.root==null);
	}
	
	public T pop() {
		if (this.root==null) return null;
		Node itemToPop = this.root;
		this.root = this.root.getNextNode();
		this.count--;
		return (T) itemToPop.getData();
	}
	
	public T peek() {
		if(this.root == null) {
			return null;
		}else {
			return (T) this.root.getData();
		}
	}
}
