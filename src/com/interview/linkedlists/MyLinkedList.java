package com.interview.linkedlists;

public class MyLinkedList<T extends Comparable> implements MyList<T> {
	
	private Node<T> head;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		++this.sizeOfList;
		if(head == null) {
			head = new Node<>(data);
		} else {
			//insertAtBeginning(data);
			insertDataAtEnd(data, head);
		}
		
	}
	//O(1)
	private void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNext(head);
		this.head = newNode;
	}
	//This is normal way ----(send the head as parameter for this) 
	//write it in a recursive way
	/*private void insertDataAtEnd(T data,Node node) {
		Node<T> newNode = new Node<>(data);
		while(node.getNext()!=null) {
			node = node.getNext();
		}
		node.setNext(newNode);
	}*/
	
	private void insertDataAtEnd(T data,Node node) {
		if(node.getNext()!=null) {
			insertDataAtEnd(data, node.getNext());
		}else {
			Node<T> newNode = new Node<>(data);
			node.setNext(newNode);
		}
	}
	

	@Override
	public void remove(T data) {
		if(this.head == null) return;
		--this.sizeOfList;
		
		if(this.head.getData().compareTo(data)==0) {
			this.head = this.head.getNext();
		} else {
			remove(data,head,head.getNext());
		}
	}
	
	private void remove(T data,Node<T> prevNode,Node<T> actual) {
		while (actual != null) {
			if(actual.getData().compareTo(data) == 0) {
				prevNode.setNext(actual.getNext());
				actual = null;
				return;
			}
				prevNode = actual;
				actual = actual.getNext();
		}
	}

	@Override
	public void traverseList() {
		if(this.head == null) return;
		
		Node<T> actual = this.head;
		while (actual != null) {
			System.out.print(actual+" -> ");
			actual = actual.getNext();
		}
		
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}
	
	
	@Override
	public Node<T> getMiddleNode() {
		Node<T> fastPointer = this.head;
		Node<T> slowPointer = this.head;
		while (fastPointer.getNext()!=null && fastPointer.getNext().getNext()!=null) {
			fastPointer = fastPointer.getNext().getNext();
			slowPointer = slowPointer.getNext();
		}
		return slowPointer;
	}
	@Override
	public void reverse() {
		Node<T> prev = null,next = null;
		Node<T> curr = this.head;
		
		while (curr!=null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		this.head = prev;
	}

}
