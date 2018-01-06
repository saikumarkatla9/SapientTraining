package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.vo.Emp;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the eid");
		int eid = sc.nextInt();
		System.out.println("enter the ename");
		String ename = sc.next();
		System.out.println("enter the salary");
		double sal = sc.nextDouble();

		Emp emp = new Emp();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSal(sal);
		
		EmpService ser = new EmpService();
		boolean res= ser.addToFile(emp);
		System.out.println(res);
		sc.close();
	}

}
