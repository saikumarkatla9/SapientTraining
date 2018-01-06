package com.pack1;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {

	public static void main(String[] args) {
		
		//convert instant into local date
		
		Instant ins = Instant.now();
		ZonedDateTime zt = ins.atZone(ZoneId.systemDefault());
		LocalDate dt = zt.toLocalDate();
		
		//convert local date into java.sql.Date
		
		LocalDate ld = LocalDate.now();
		java.sql.Date sqldt = Date.valueOf(ld);
		System.out.println("sql dt:"+sqldt);
		
		//convert java.sql.Date into local date
		LocalDate ld2 = sqldt.toLocalDate();
		System.out.println(ld2);
	}

}
