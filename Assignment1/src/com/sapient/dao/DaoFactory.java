package com.sapient.dao;

import java.util.ResourceBundle;

public class DaoFactory {

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
		
		return dao;
	}
}
