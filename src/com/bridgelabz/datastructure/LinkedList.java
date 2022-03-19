package com.bridgelabz.datastructure;

public class LinkedList {
	
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
	
	public void pop() {
		if(head == null) {
			System.out.print("is empty");
		}
		head = head.next;
	}
}
