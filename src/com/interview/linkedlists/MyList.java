package com.interview.linkedlists;

public interface MyList<T> {
	public void insert(T data);
	public void remove(T data);
	public void traverseList();
	public int size();
	public Node getMiddleNode();
	public void reverse();
}
