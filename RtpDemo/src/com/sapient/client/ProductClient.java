
//Runtime Polymorphism Example program
package com.sapient.client;

import com.sapient.service.Computer;
import com.sapient.service.Mobile;
import com.sapient.service.Product;

public class ProductClient {

	public static void main(String[] args) {
		
		//Product product =  new Product();
		
		Product[] arr =new Product[4];
		arr[0]= new Computer(1001,"acer laptop",70000,"4tb");
		arr[1]=new Computer(1002,"hp laptop",20000,"2tb");
		arr[2]=new Mobile(1002,"lenovo phone",5000,"10mp");
		arr[3]=new Mobile(1004,"redmi",7000,"13mp");
		
		System.out.println("--------------------------------------------");
		System.out.printf("%10s %20s %10s %10s %10s %20s %20s \n","pid","pname","price","hod","cam","range","type");
		System.out.println("--------------------------------------------");
		
		for(Product prod:arr){
			prod.display();
			
		}
		System.out.println("--------------------------------------------");
	}
}
