package com.collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Black");

	hs.add("Red");
	hs.add("Blue");
	hs.add("Black");
	
	Iterator it =hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	hs.add("Green");
	hs.add(null);
	System.out.println();
	Iterator it1 =hs.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	}

}
