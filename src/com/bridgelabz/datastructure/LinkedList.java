package com.bridgelabz.datastructure;

public class LinkedList  {
	
	Node head;
	Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void show() {
		Node  temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void insertAtMiddle(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			//return node;
		}
		else {
			 Node temp = head;
	           Node middle = head;
	            // Find the middle node
	            while (temp.next != null && temp.next.next != null)
	            {
	                temp = temp.next.next;
	                middle = middle.next;
	            }
	            // add node
	            newNode.next = middle.next;
	            middle.next = newNode;
		}
	}
	
	public void popFirst() {
		if(head == null) {
			System.out.print("is empty");
		}
		head = head.next;
	}
	
	public Node popLast() {
		if(head == null || head.next == null) {
			return null;
		}
		// Find the second last node
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        // change the second last node next pointer to null
        temp.next = null;
 
        return head;
	}
	
	public boolean searchNode(int node) {
		Node current = head;
		while(current != null) {
			if(current.data == node) {
				return true;
			}
		   current = current.next;
		}   
		return false;
	}	
	
	public void insertAtPosition(int newElement, int position) {
			
		Node newNode = new Node(position); 
	    newNode.data = newElement;
	    newNode.next = null;

	    if(position < 1) {
	      //System.out.print("\nposition should be >= 1.");
	    } else if (position == 1) {
	      newNode.next = head;
	      head = newNode;
	    } else {
	      
	      Node temp = new Node(position);
	      temp = head;
	      for(int i = 1; i < position-1; i++) {
	        if(temp != null) {
	          temp = temp.next;
	        }
	      }
	   
	      if(temp != null) {
	        newNode.next = temp.next;
	        temp.next = newNode;  
	      } else {
	        //System.out.print("\nThe previous node is null.");
	      }       
	   }
	}    
		
}
