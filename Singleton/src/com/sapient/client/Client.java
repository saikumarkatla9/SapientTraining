package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.service.IEmpSer;

public class Client {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		IEmpSer ser= null;
		String opt = null;
		int eid;
		do{
			ser = EmpService.getInstance();
			System.out.println("Enter EID");
			eid = sc.nextInt();
			try {
				System.out.println(ser.display(eid));
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			System.out.println("press 'y' to continue");
			opt = sc.next();
		}while(opt.equals("y"));
		
		/*IEmpSer ser = EmpService.getInstance();
		IEmpSer ser2 = EmpService.getInstance();
		IEmpSer ser3 = EmpService.getInstance();*/
	}
}
