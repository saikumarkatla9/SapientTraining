package com.sapient.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.sapient.vo.Emp;

public class EmpService {

	public boolean addToFile(Emp emp){
		boolean res=false;
			try(PrintWriter pw =new PrintWriter(new FileWriter("sap.txt",true))){
			
			pw.write(emp.getEid()+","+emp.getEname()+","+emp.getSal()+","+emp.getPf()+","+emp.getNetPay());
			res=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
		
	}
}
