package com.java8;

interface TestInterface
{
	public void square(int s);
	
	public default String show() {
		return "Show Method";
	}
	
	}

public class DefaultMethod implements TestInterface{

	@Override
	public void square(int s) {
		
		System.out.println("Square= "+s*s);
		
	}
	
		public static void main(String[] args) {
		DefaultMethod defaultMethod=new DefaultMethod();
		defaultMethod.square(3);
		
		//defaultMethod.show();
		
		defaultMethod.show();

	}

}
