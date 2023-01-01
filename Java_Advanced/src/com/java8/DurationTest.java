package com.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DurationTest {

	
	 public static void checkPeriod()
	    {
	        LocalDate date1 = LocalDate.now();
	 
	        LocalDate date2 = LocalDate.of(2016, Month.JANUARY, 1);
	 
	        Period gap = Period.between(date2, date1);
	        System.out.println("gap between dates is a period of "+gap);
	}
	 
	public static void Test() {
		
		Duration d=Duration.ofDays(10);
				
		LocalDateTime current=LocalDateTime.now();
		
		LocalDateTime current1= current.plus(d);
		
		System.out.println("current1: "+current1);
		
		
		Duration gap = Duration.between(current1, current);
        System.out.println(" gap between time1 & time2= " + gap);
	}
	
	public static void main(String[] args)
    {
         
		Test();
		checkPeriod();
         
    }
}
