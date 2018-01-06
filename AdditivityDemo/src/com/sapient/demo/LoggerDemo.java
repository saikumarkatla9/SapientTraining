package com.sapient.demo;

import org.slf4j.*;
//import org.slf4j.LoggerFactory;

public class LoggerDemo {

	public static void main(String[] args){
	
		Logger root=LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		Logger con=LoggerFactory.getLogger("com");
		Logger con_sap=LoggerFactory.getLogger("com.sap");
		
		root.debug("root message 1");
		con.debug("com message");
		con_sap.debug("com.sapient message");
	}
	 
}

	
