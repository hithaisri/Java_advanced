package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
	
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(6);
		nums.add(9);
		nums.add(5);
		nums.add(3);
		nums.add(1);
		
		findSecondLargest(nums);
		findSecondSmallest(nums);
		
	}
	
	public static void findSecondLargest(List<Integer> nums) {
		
		Integer large=Integer.MIN_VALUE;
		Integer slarge=Integer.MIN_VALUE;
		for(int i=0;i<nums.size();i++) {
			
			if(nums.get(i)>large)
			{
			slarge=large;
			large=nums.get(i);
			}
			
			else if(nums.get(i)>slarge && large!=nums.get(i))
				slarge=nums.get(i);
			
				
		}
		System.out.println("Second largest= "+slarge);
	}
	
    public static void findSecondSmallest(List<Integer> nums) {
		
    		Collections.sort(nums);
    		
    		System.out.println("Second Largest num="+nums.get(1));
		
		
	}

}
