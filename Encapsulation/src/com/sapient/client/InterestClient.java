package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;
import com.sapient.util.SapUtil;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		double principle = sc.nextDouble();
		
		System.out.println("Enter the years");
		int term = sc.nextInt();
		
		System.out.println("Enter the rate");
		float per  = sc.nextFloat();
		
			Interest obj = new Interest();
			
			try {
				obj.setAmt(principle);
				obj.setRate(per);
				obj.setYears(term);
				double si = obj.calcSimple();
				double ci = obj.calcCompound();
				
				System.out.println("simple interest : "+SapUtil.roundUp2Dec(si));
				System.out.println("compound interest : "+SapUtil.roundUp2Dec(ci));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println(obj.getAmt()+" "+obj.getRate()+" "+obj.getYears());
			
			sc.close();	
	}

}
