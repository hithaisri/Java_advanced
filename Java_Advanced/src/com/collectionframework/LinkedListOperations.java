package com.collectionframework;

import java.util.LinkedList;

public class LinkedListOperations {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void print_list(LinkedListOperations list)
	{
		Node currNode=list.head;
		
		while(currNode!=null) {
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		
	}
	
	public static void main(String[] args) {
		/*LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		 
		System.out.println(list);
		*/
		
		LinkedListOperations l=new LinkedListOperations();
		
		addNode(l, 11);
		addNode(l, 12);
		addNode(l, 13);
		addNode(l, 14);
		addNode(l, 15);
		
		print_list(l);
	}
	
	
	public static LinkedListOperations addNode(LinkedListOperations list, int data) {
		
		Node node = new Node(data);

		
		if (list.head == null) {
			list.head = node;
		} else {
			
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}

		return list;
	}
}
