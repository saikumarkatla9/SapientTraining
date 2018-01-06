package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class ProxyImpl implements ISer{

	private ISer ser = new SerImpl();
	private static Map<String,String> emap;
	
	private String uname,pwd;
	public ProxyImpl(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}


	static{
		emap = new HashMap<>();
		emap.put("1001","ram");
		emap.put("1002", "abc");
		
		}
	
	
	@Override
	public double calcSimple(double p, int n, float r) {
		if(!emap.containsKey(uname) || !emap.get(uname).equals(pwd)){
			 System.out.println("you are not authenticated to access");
			 return 0;
		}
		else
		    return ser.calcSimple(p, n, r);
		}

}
