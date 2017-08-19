/* class description
 * 
 * 
 *  the class has implementation for insert, iterate and reverse functions for linked list
 *  print statements are commented, but if you'd like to see the process, u can uncomment and see the detail of insertion, iteration and reverse functions

 * 
 * */





package com.example.linkedlistImplmentation;

import java.util.Stack;

public class TestNode {

	
	 Node head=null;
	 int listSize;
	
	// to insert new node into list
    public Node insertIntoList(int item)
    {
    	//list is empty
    	if(head==null)
    	{
    		Node node = new Node(item);
    		node.next = null;
    		head= node;
    		//System.out.println("current value inserted "+node.value+" head pointing at"+head.value);
    		
    		listSize++;
    	}
    		
    	else 
    		
    		//if list is not empty
    		{
    		
    		//traverse to the last element of the list
    		Node pointer;
    		for(pointer = head; pointer.next!=null; pointer=pointer.next)
    		
    		{
    			
    		}
    			
    			if(pointer.next==null)
    			{
    				Node node = new Node(item);
    				node.next=null;
    				pointer.next=node;
    				//System.out.println("current value inserted "+node.value+" head pointing at"+head.value+" pointer pointing at "+pointer.value);
    				listSize++;
    			}
    			
    	}

    	return head;
    
    
    }
    
    // to read all values from the list
    public void iterateList(Node head)
    { 		
    	if(head!=null)
    {
    	
    	//System.out.println("*********************** iterate list");
    	for (Node pointer = head; pointer!=null; pointer=pointer.next) {
    		//if(pointer!=null)
    		//System.out.println(""+pointer.value);
    		
    		
		}
    
    	//System.out.println("size is "+listSize);
    
    }
    
    }
    
    
    //reverse the list
    //function uses stack to reverse the list
    // it traverse the whole list, push nodes into stack,and then pop nodes from stack and insert back into the list
    public Node reverseList(Node head){
		
    	
    	if(head!=null)
    	{
    	//System.out.println("************************list reverse\n\n");
    	
    	Stack<Node> stack = new Stack<Node>();
    	
    	Node pointer;
    	for(pointer = head; pointer.next!=null; pointer=pointer.next)
    	{
    		stack.push(pointer);
    		//System.out.println("stack is "+stack.peek().value);
    		//System.out.println("head is"+head.value+" \n pointer is "+pointer.value);
    		
    	}
    	
    	stack.push(pointer);
		//System.out.println("stack is "+stack.peek().value);
		//System.out.println("head is"+head.value+" \n pointer is "+pointer.value);
		
		if(stack.size()>1)
		{
		
		for(int i=stack.size(); i>=0; i=stack.size())
		{
			if(stack.size()!=0)
			{
			
			if(i==stack.size() && pointer.next==null)
			{
				head=pointer;
				Node lastNode = stack.pop();
				Node secondLast = stack.pop();
    			lastNode.next=secondLast;
    			pointer=lastNode.next;
				
			}
		
			else if(i==stack.size() && stack.size()!= 1)
			{
				Node lastNode = stack.pop();
				pointer.next=lastNode;
				pointer=lastNode;
				
			}
			else if (stack.size()==1){
				Node lastNode = stack.pop();
    			pointer.next=lastNode;
    			pointer= lastNode;
    			lastNode.next=null;
				
			}
		}
			
			else {
				
				pointer.next=null;
				break;
			}
		
		
		}
		}
		
    	
    	
    	return head;
    	
    	
    }
    	
    	else return head;
    }    
	
	

}
