package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SerializeDemo{



	public static void main(String[] args) throws IOException {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter salary");
		double sal= sc.nextDouble();*/
		
		FileOutputStream fos = new FileOutputStream("employee.txt",true); //true means appends another object
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		Emp emp1= new Emp(1001,"ram",60000);
		Emp emp2= new Emp(1002,"tom",45000);
		Emp emp3= new Emp(1003,"tarun",50000);
		
		oos.close();
		fos.close();
		System.out.println("serialized");
	}

}
