package com.pack1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class OldDate {

	public static void main(String[] args) {
		
		/*Date dt = new Date();
		System.out.println(dt);
		Calendar c = Calendar.getInstance();
		System.out.println(c);*/
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
		Date d = new Date();
		System.out.println(df.format(d));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALY);
		Calendar c = Calendar.getInstance();
		System.out.println(df2.format(c.getTime()));
	}

}
