package com.dsa;

public class CheckPrime {

	public static void main(String[] args) {
		
		Integer n=5;
		boolean flag= checkPrimeNumber(n);
	
		if(flag==true)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
	static int i=2;
	
	public static boolean checkPrimeNumber(Integer n) {
		
		if(n==0 || n==1)
			return false;
		if(n==i)
			return true;
		if(n%i==0)
			return false;
		i++;
		
		return checkPrimeNumber(n);
		
	}
	
}
