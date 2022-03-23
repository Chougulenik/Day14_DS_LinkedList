package com.bridgelabz.datastructure;

public class LinkedList  {
	
	static Node head;
	Node tail;
	static int size;
	
//	LinkedList() {
//		size = 0;
//	}
	
	protected void add(int data) {
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
	
	protected void append(int data) {
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
	
	protected void insertAtMiddle(int data) {
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
	
	protected void popFirst() {
		if(head == null) {
			System.out.print("is empty");
		}
		head = head.next;
		size--;
	}
	
	protected Node popLast() {
		if(head == null || head.next == null) {
			return null;
		}
		// Find the second last node
		size--;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        // change the second last node next pointer to null
        temp.next = null;
 
        return head;
	}
	
	protected boolean searchNode(int node) {
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
	
	public void removeElements(int key) {
		Node current = head;
		Node temp = null;
		
		if(current != null  && current.data == key) {
			head = current.next;
			return;
		}
		
		while(current != null  && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
		}
		temp.next = current.next;
		size--;
	}
	
	public void sortList() {
		Node current = head;
		Node index = null;
		int temp;
		
		if(head == null) {
			return;
		}
		else {
			while(current != null) {
				index = current.next; //node index node point to next to
				while(index != null) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}
	
	public int getSize() {
		System.out.println();
		return size;
	}
	
}