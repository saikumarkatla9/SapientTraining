package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		try {
			Mtable obj = new Mtable(num);
			obj.display(3,7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		sc.close();
	}

}
