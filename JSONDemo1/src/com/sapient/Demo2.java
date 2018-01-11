package com.sapient;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo2 {

	public static void main(String[] args) {
		JSONObject json1 = new JSONObject();
		json1.put("eid", 1001);
		json1.put("ename", "sai");
		json1.put("sal", 15000);
		
		JSONObject json2 = new JSONObject();
		json1.put("eid", 1002);
		json1.put("ename", "janit");
		json1.put("sal", 18000);
		
		JSONObject json3 = new JSONObject();
		json1.put("eid", 1003);
		json1.put("ename", "harman");
		json1.put("sal", 16000);
		
		JSONArray jarr = new JSONArray();
		jarr.add(json1);
		jarr.add(json2);
		jarr.add(json3);
		
		System.out.println(jarr);
	}

}
