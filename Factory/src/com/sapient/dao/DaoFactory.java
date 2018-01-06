package com.sapient.dao;

import java.util.ResourceBundle;

/*
creates instance based on the value configured in properties file


*/public class DaoFactory {

	private static ResourceBundle rb;
	static{
		rb = ResourceBundle.getBundle("sapient");
	}
	public static IDao getDaoInstance(){
		IDao dao = null;
		try {
			Class cls = Class.forName(rb.getString("cname"));
			dao = (IDao)cls.newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		
		return dao;
	}
}
