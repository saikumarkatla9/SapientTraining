package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Savings;

public class AccountClient {

	private static Account[] arr= new Account[2];
	static{
		arr[0]=new Savings(1001,"rama",5000);
		arr[1]=new Loan(1002,"amar",25000);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = null;
		int accType=0;
		double amt=0;
		do{
			
			System.out.println("enter acc type 0--savings,1--loan");
			accType=sc.nextInt();
			if(accType!=0 || accType!=1){
				System.out.println("Invalid account type");
				
			}
			else{
			System.out.println("enter amount to deposit");
			amt=sc.nextDouble();
			
			arr[accType].deposit(amt);
			arr[accType].display();
			}
			System.out.println("press y to continue");
			opt = sc.next();
		}while(opt.equals("y"));
		sc.close();
	}

}
