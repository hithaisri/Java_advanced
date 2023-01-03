package com.collectionframework;

import java.util.Stack;

public class StackImpl {

	static void stack_push(Stack<Integer> st) {
		for(int i=0;i<5;i++)
			st.push(i);
	}
	
	static void stack_pop(Stack<Integer> s) {
		for(int i=0;i<5;i++)
			System.out.println(s.pop());
	}
	
	static void stack_peek(Stack<Integer> stack)
	{
		Integer element=stack.peek();
		System.out.println(element);
	}
	
	static void stack_search(Stack<Integer> s1,int element) {
		Integer pos=s1.search(element);
		
		if(pos==-1)
			System.out.println("Not FOund");
		else 
			System.out.println("FOund at ="+pos);
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		stack_push(s);
		stack_pop(s);
		stack_push(s);
		stack_peek(s);
		stack_search(s,0);
		
		stack_search(s,3);
	}
}
