package com.pack1;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer{

	@Override
	public void update(Observable ord, Object msg) {
		if(ord instanceof Order){
			Order order = (Order)ord;
			System.out.println("customer notifies"+((Order) ord).getStatus());
		}
		
	}

	
}
