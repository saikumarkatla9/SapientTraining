package com.pack2;

import java.util.Timer;

public class TimeSchedularMain {

	public static void main(String[] args) {
		
		ReportGenerator obj = new ReportGenerator();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(obj, 2000, 4000);
	}

}
