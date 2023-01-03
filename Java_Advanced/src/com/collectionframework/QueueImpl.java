package com.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	
	public static void main(String[] args) {
	
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=1;i<5;i++)
			q.add(i);
		
		System.out.println(q);
		
		int removedele=q.remove();
		System.out.println("Removed = "+removedele);
		System.out.println(q);

		int head=q.peek();
		System.out.println("Head of the queue = "+head);
	}
}
