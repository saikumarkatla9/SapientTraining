package com.sapient.client;

import java.util.Scanner;

import com.sapient.computers.CompBuilder;
import com.sapient.computers.Computer;

public class ClientA {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the ctype");
		String ctype = sc.next();
		System.out.println("enter the processor");
		String ptype = sc.next();
		try {
			Computer comp = CompBuilder.getComputer(ctype, ptype);
			comp.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
