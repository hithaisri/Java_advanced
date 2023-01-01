package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {



	public static void main(String[] args) {

		Student s1 = new Student(1,"Hitu",28);
		Student s2 = new Student(2,"Sat",26);
		Student s3 = new Student(3,"rak",33);

		List<Student> l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		Collections.sort(l1,new NameCompare());
		System.out.println("Name COmpare");

		for(Student s:l1) {
			System.out.print(s.id+" ");
			System.out.print(s.name+" ");
			System.out.println(s.age+" ");
		}

		Collections.sort(l1,new ComparatorAge());
		System.out.println("Age COmpare");

		for(Student s:l1) {
			System.out.print(s.id+" ");
			System.out.print(s.name+" ");
			System.out.println(s.age+" ");
		}
	}

}
