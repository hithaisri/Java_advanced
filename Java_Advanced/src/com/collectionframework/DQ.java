package com.collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class DQ {

	public static void main (String[] args) {

		PriorityQueue<String> pq=new PriorityQueue<String>();

		pq.add("Blue");
		pq.add("Red");
		pq.add("Green");
		pq.add("A");

		System.out.println("Peek :"+ pq.peek());

		System.out.println("Element fetch :"+ pq.element());

		System.out.println("List the pq elements EX: "); 

		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

		pq.poll();


		System.out.println("Poll EX: "); 

		Iterator it1=pq.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next()); 
		}

		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();

		pq1.add(56);
		pq1.add(19);
		pq1.add(97);


		Iterator it2=pq1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next()); 
		}


		Deque<String> dg=new ArrayDeque<String>();
		dg.add("g");
		dg.add("a");

		Deque<Integer> dg1=new ArrayDeque<Integer>();
		dg1.add(1);
		dg1.add(6);

		for(String s:dg) {
			System.out.println(s);
		}
	}
}
