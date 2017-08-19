/*class description
 * 
 * Base class for Custom linked list
 * 
 * */






package com.example.linkedlistImplmentation;

public class Node {
	
	 Node next;
	   int value;
	 
	 public Node(int item)
	 {
		 this.value = item;
		 
	 }

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	 
	 
	
}
