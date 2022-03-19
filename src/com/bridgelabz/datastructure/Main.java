package com.bridgelabz.datastructure;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.append(56);
		//list.append(30);
		list.append(70);
		list.show();
		System.out.println();
		list.insertAtMiddle(30);
		list.show();		
	}

}
