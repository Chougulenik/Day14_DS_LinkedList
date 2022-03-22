package com.bridgelabz.datastructure.stack;

import com.bridgelabz.datastructure.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();		
		}
	}

}
