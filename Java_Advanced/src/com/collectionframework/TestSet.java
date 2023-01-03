package com.collectionframework;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class TestSet {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("a");
		set.add(null);
		
		set.isEmpty();
		
		Iterator<String> sets=set.iterator();
		
		while(sets.hasNext()){
			System.out.println(""+sets.next());
		}
		
		
		TreeSet<Integer> prime=new TreeSet<Integer>(Collections.reverseOrder());
		prime.add(2);
		prime.add(29);
		prime.add(23);
		prime.add(17);
		prime.add(3);
		prime.add(19);
		prime.add(5);
		prime.add(11);
		prime.add(13);
		prime.add(7);
		
     Iterator<Integer> primeNumbers =prime.iterator();
		
		while(primeNumbers.hasNext()){
			System.out.println(""+primeNumbers.next());
		}
		
		TreeSet<User> userTree=new TreeSet<>(Comparator.comparing(User::getLastName));
		userTree.add(new User(1,"Ajay","Kumar",20));
		userTree.add(new User(2,"Ram","Prakash",22));
		userTree.add(new User(3,"Sathish","Gupta",24));
		userTree.add(new User(4,"Rakshith","M K",26));
		
        Iterator<User> users =userTree.iterator();
		
		while(users.hasNext()){
			System.out.println(""+users.next().getLastName());
		}
		
		
	}
}
