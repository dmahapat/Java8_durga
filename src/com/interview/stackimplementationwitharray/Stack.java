package com.interview.stackimplementationwitharray;

public class Stack<T> {
	private T[] stack;
	
	//In array implmentation we will have to take care of the size.
	//when array exceeds the size limit the size has to be double 
	private int numberOfItems;
	
	public Stack() {
		//we cannot create generic array
		this.stack = (T[]) new Object[1];
	}
	//O(1) if no resize
	public void push(T newData) {
		if(numberOfItems == this.stack.length) {
			resize(2*this.stack.length); 
			// doubling the size of array is the optimal resizing procedure
		}
		this.stack[numberOfItems++] = newData;
	}
	
	private void resize(int capacity) {
		T[] stackCopy = (T[]) new Object[capacity];
		for (int i = 0; i < this.numberOfItems; i++) {
			stackCopy[i] = this.stack[i];
		}
		this.stack = stackCopy;
	}
	public boolean isEmpty() {
		return (this.numberOfItems==0);
	}
	public int size() {
		return this.numberOfItems;
	}
	//O(1) if no resize
	public T pop() {
		if(isEmpty())return null;
		T itemToPop = this.stack[--numberOfItems];
		this.stack[numberOfItems]=null;
		if(numberOfItems>0 && numberOfItems == this.stack.length/4) {
			resize(this.stack.length/2);
		}
		return itemToPop;
	}
	
}
