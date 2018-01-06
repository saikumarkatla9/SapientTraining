package com.sapient.fp;

public class CaseClient {
/*
	
demo on Functional programming	
	
*/	public static void main(String[] args) {
		//ICase lower = s->s.toLowerCase();
		//ICase upper = (String s)->{return s.toUpperCase();};
		display(s->s.toLowerCase(),"yaMAha");
		display((String s)->{return s.toUpperCase();},"bugatti");

	}
	public static void display(ICase obj,String str){
		String res = obj.changeCase(str);
		System.out.println(res);
	}

}
