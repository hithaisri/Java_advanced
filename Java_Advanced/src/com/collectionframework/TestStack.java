package com.collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
	Stack<Integer> stackprime=new Stack<Integer>();
	
	
	stackprime.push(2);
	stackprime.push(3);
	stackprime.push(11);
	stackprime.push(5);
	System.out.println("Popped :"+stackprime.pop());
	
	stackprime.push(7);
	
	
	Iterator<Integer> it=stackprime.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}
	
}
