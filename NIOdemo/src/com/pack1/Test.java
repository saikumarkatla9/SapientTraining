package com.pack1;



class A{
	static{System.out.println("static A");}
	{System.out.println("instance A");}
	A(){
	System.out.println("A const");
	}
}
public class Test extends A{
	static{System.out.println("static B");}
	{System.out.println("instance B");}
	Test(){
		System.out.println("B const");
	}
	public static void main(String[] args){
	Test t = new Test();
	}
}
