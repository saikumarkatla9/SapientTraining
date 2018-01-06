package com.pack1;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		Order order = new Order();
		Customer cust = new Customer();
		
		order.addObserver(cust);
		String str = null;
		do{
			System.out.println("admin changes the status");
			str = sc.next();
		}while(!str.equals("delivered"));
		sc.close();
	}
}
