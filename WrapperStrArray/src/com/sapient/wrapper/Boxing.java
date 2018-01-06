package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=new Integer(10); //boxing
		Integer b = new Integer(20);
		int res = a.intValue()+b.intValue();
		System.out.println(Integer.valueOf(res));
		
	}

}
