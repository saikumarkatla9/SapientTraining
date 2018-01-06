package com.sapient.util;

import com.sapient.vivo.Emp;

public class EmpUtil {

	public static void display(Emp emp){
		System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getSal());
	}

}
