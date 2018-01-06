package com.pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		//converting string into local date
		String text = "12-feb-2017";
		LocalDate ld = LocalDate.parse(text);
		System.out.println(ld);
		
		//converting local date into string
		LocalDate ld2 = LocalDate.of(2016, 9, 21);
		System.out.println(ld2.format(df));
	}

}
