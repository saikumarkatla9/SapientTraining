package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtil {

	private static ResourceBundle rb;
	private static Idao dao;
	static{
		rb=ResourceBundle.getBundle("sap");
			try{
				Class cls = Class.forName(rb.getString("cname")); //load the class
				dao=(Idao)cls.newInstance(); //create instance
			}
			catch(Exception e){
			System.out.println(e.getMessage());
			}
		}
	
	public static Idao getDaoInstance(){
		Idao dao=EmpUtil.getDaoInstance();
		return dao;
	}
}
