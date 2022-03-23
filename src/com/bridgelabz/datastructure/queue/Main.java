package com.bridgelabz.datastructure.queue;

public class Main {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.append(56);
		queue.append(30);
		queue.append(70);
		queue.show();
		System.out.println();
		queue.dequeue();
		queue.show();
		
	}
}
