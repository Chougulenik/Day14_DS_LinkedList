package com.bridgelabz.datastructure;

public class LinkedList  {
	
	static Node head;
	Node tail;
	
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
	}
	
	protected Node popLast() {
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
	
	public static boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public static void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public static int pop() {
		if(isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.data;
	}
		
}
