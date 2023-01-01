package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void test() {
		List<Integer> l1=new ArrayList<Integer>();

		l1.add(0, 110);
		l1.add(1, 220);
		l1.add(2, 330);

       System.out.println("List1: "+l1);
     
       List<Integer> l2=new ArrayList<Integer>();

       l2.add(0, 11);
       l2.add(1, 22);
       l2.add(2, 33);
		
       l1.addAll(1, l2);
       
       System.out.println("List1: "+l1);
       
       l1.remove(2);
       
       System.out.println("List1: "+l1);

       System.out.println("element at 1 position "+l1.get(1));
       
       l1.set(2, 90);
       
       System.out.println("List1: "+l1);

       l1.add(50);
       
       System.out.println("List1: "+l1);

       l1.add(1, 20);
       
       System.out.println("List1: "+l1);


      
	}
	public static void main(String[] args) {

		test();
	}


}
