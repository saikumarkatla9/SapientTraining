package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SerializeDemo{



	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("employee.txt"); //true means appends another object
		ObjectOutputStream oos =new ObjectOutputStream(fos);

		Emp emp3= new Emp(1003,"tarun",50000);
		oos.writeObject(emp3);
		
		oos.close();
		fos.close();
		System.out.println("serialized");
	}

}
