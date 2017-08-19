/*
 * 
 * class description
 * 
 * 
 * 
 * this is a class uses Junit and has 4 different test cases in 4 functions
 * test function will call all these functions and give one summary after whole execution
 * 
 * each function creates a custom linked list using Test Node class and another list using java Linked list ( to match expected values), 
	it reverses the custom linked list and match the result with java linked list.
	java linked list is hard coded because we already know the expected response and we want to compare the response form the custom linked list with Java linked list.
 *  
 *  */





package com.example.linkedlistTest;

import static org.junit.Assert.*;

import java.util.LinkedList;

import com.example.linkedlistImplmentation.Node;
import com.example.linkedlistImplmentation.TestNode;

public class Test {

	@org.junit.Test
	public void test() {
		
		//when linked list has more than 2 nodes, in this case it has 5 nodes
		testMultipleValues();
		//when list is empty/null
		testWithNoValue();
		//when list has two nodes
		testWithTwoValues();
		//when list has one node
		testWithOneValue();
		
	}

	
	private void testWithOneValue() {
		
		
		//custom linked list

		TestNode testNode = new TestNode();
		Node head;
		head=testNode.insertIntoList(1);				//custom linked list using test node
		testNode.iterateList(head);
		head=testNode.reverseList(head);
		testNode.iterateList(head);
		
		//java linked list
		LinkedList<Node> javaList = new LinkedList<Node>();   // java linked list populated with expected response
		javaList.add(new Node(1));
		
		Node pointer = head;
		for(int i=0; i<javaList.size(); i++)
		{
			
			if(pointer!=null)
			{
				//Matching
				assertEquals(pointer.getValue(), javaList.get(i).getValue());
				pointer=pointer.getNext();
			
			}
		}
		
	}

	private void testWithTwoValues() {


		//custom linked list
		
		TestNode testNode = new TestNode();
		Node head;
		head=testNode.insertIntoList(1);                  //custom linked list using test node
		head=testNode.insertIntoList(2);
		testNode.iterateList(head);
		head=testNode.reverseList(head);
		testNode.iterateList(head);
		
		//java linked list
		LinkedList<Node> javaList = new LinkedList<Node>(); // java linked list populated with expected response
		javaList.add(new Node(2));
		javaList.add(new Node(1));
		
		Node pointer = head;
		for(int i=0; i<javaList.size(); i++)
		{
			
			if(pointer!=null)
			{
				assertEquals(pointer.getValue(), javaList.get(i).getValue());
				pointer=pointer.getNext();
			
			}
		}
		
	}

	private void testWithNoValue() {
		
		//custom linked list
		
		TestNode testNode = new TestNode();
		Node head=null;                           //custom linked list using test node
		head=testNode.reverseList(head);
		
		//java linked list
		LinkedList<Node> javaList = new LinkedList<Node>();   // java linked list populated with expected response
		Node pointer= head;
		
		try{
		assertEquals(pointer.getValue(), javaList.get(0).getValue());
		}catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		
	}

	private void testMultipleValues() {
		
		//custom linked list
		
		TestNode testNode = new TestNode();
		Node head;
		
		head=testNode.insertIntoList(1);
		head=testNode.insertIntoList(2);
		head=testNode.insertIntoList(3);  //custom linked list using test node
		head=testNode.insertIntoList(4);
		head=testNode.insertIntoList(5);
		head=testNode.insertIntoList(6);
		head=testNode.insertIntoList(7);
		head=testNode.insertIntoList(8);
		head=testNode.insertIntoList(9);
		testNode.iterateList(head);
		head=testNode.reverseList(head);
		testNode.iterateList(head);
		
		//java linked list
		LinkedList<Node> javaList = new LinkedList<Node>();
		javaList.add(new Node(9));
		javaList.add(new Node(8));
		javaList.add(new Node(7)); // java linked list populated with expected response
		javaList.add(new Node(6));
		javaList.add(new Node(5));
		javaList.add(new Node(4));
		javaList.add(new Node(3));
		javaList.add(new Node(2));
		javaList.add(new Node(1));
		
		Node pointer = head;
		for(int i=0; i<javaList.size(); i++)
		{
			
			if(pointer!=null)
			{
				assertEquals(pointer.getValue(), javaList.get(i).getValue());
				pointer=pointer.getNext();
			
			}
		}
	}

}
