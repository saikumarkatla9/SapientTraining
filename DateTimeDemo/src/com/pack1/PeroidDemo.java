package com.pack1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeroidDemo {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2016,4,5);
		LocalDate ld2 = LocalDate.of(2017, 12, 7);
		
		//finds the difference between the dates
		Period p =Period.between(ld1, ld2);
		System.out.println(p.getDays()+ " days");
		System.out.println(p.getMonths()+ " months");
		System.out.println(p.getYears()+ " years");
		
		//finds the difference between the times and returns in seconds/nano seconds
		LocalTime t1 = LocalTime.of(10, 10);
		LocalTime t2 = LocalTime.of(12, 30);
		
		Duration d = Duration.between(t1, t2);
		System.out.println(d.getSeconds());
		

	}

}
