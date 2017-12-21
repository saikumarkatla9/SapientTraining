package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.valueobject.Emp;

public class EmpClient {

	static Scanner sc = new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();
	public static void main(String[] args) {
		
		String menu=null;
		String option=null;
		Menu emenu=null;
		do{
			System.out.println("choose :ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n");
			menu=sc.next();
			try{
				emenu = Menu.valueOf(menu);
				processMenu(emenu);
			}catch(Exception es){
				System.out.println("invalid menu option");
			}
			System.out.println("press 'y' to continue");
			option=sc.next();
		}while(option.equals("y"));
	}

	public static void processMenu(Menu menu){
		switch(menu){
		case VIEWALL:
			viewAll();
			break;
		case VIEW:
			viewById();
			break;
		case ADD:
			add();
			break;
		}
	}
	
	public static void viewAll(){
		List<Emp> list = dao.viewEmployee();
		for(Emp emp:list){
			System.out.println(emp);
		}
	}
	
	public static void viewById() {
		System.out.println("Enter the eid:");
		int eid = sc.nextInt();
		try {
			Emp emp =  dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void add(){
		System.out.println("Enter employee id");
		int eid = sc.nextInt();
		System.out.println("Enter employee name");
		String name=sc.next();
		System.out.println("Enter the salary");
		double sal=sc.nextDouble();
		System.out.println("Enter dept id");
		int did=sc.nextInt();
		System.out.println("Enter date in dd-MM-yyyy format");
		String strdt=sc.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj=LocalDate.parse(strdt,dtf);
		Emp emp = new Emp(eid,name,sal,did,doj);
		try {
			dao.addEmployee(emp);
			System.out.println("Employee added");
		} catch (IdException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
