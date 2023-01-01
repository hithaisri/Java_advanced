package com.java8;

interface TestInterface2
{

	public static void show() {
		System.out.println("Show Method in TI2"); 
	}
}

public class DefaultMethod2 implements TestInterface2 {

	
	public static void main(String[] args) {
		DefaultMethod2 defaultMethod=new DefaultMethod2();
		
		//defaultMethod.show();
		
		TestInterface2.show();
	}
}
