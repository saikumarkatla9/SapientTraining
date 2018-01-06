package com.pack1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class AdjustersDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-EEEE-MM-yyyy");
		
		LocalDate ld = LocalDate.now();
		System.out.println(df.format(ld.with(TemporalAdjusters.firstDayOfMonth())));
		System.out.println(df.format(ld.with(TemporalAdjusters.lastDayOfMonth())));
		System.out.println(df.format(ld.with(TemporalAdjusters.firstDayOfNextMonth())));
		System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));

	}

}
