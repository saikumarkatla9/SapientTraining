package com.sapient.client;

import com.sapient.service.ContractEmployee;
import com.sapient.service.Employee;
import com.sapient.service.OnrollEmployee;


public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emp = new Employee[4];
		emp[0]=new OnrollEmployee(1001,"sai",30000);
		emp[1]=new OnrollEmployee(1002,"ganesh",36000);
		emp[2]=new ContractEmployee(1003,"govind",60000,30);
		emp[3]=new ContractEmployee(1004,"manish",55000,35);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%10d %20s %10f %10f %10f %10f %20s %20s \n","empId","empName","salary","da", "pf", "days","netSalary","type");
		System.out.println("--------------------------------------------------------------------");
		
		for(Employee e:emp){
			e.display();
			
		}
		System.out.println("--------------------------------------------------------------------");
	}

}
