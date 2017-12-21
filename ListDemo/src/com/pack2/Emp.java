package com.pack2;

public class Emp implements Comparable<Emp>{

	private int eid;
	private String ename;
	private double sal;
	
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	

	public int getEid() {
		return eid;
	}


	public String getEname() {
		return ename;
	}


	public double getSal() {
		return sal;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+" "+ename+" "+sal;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1=this.eid;
		Integer e2 = emp.eid;
		return e1.compareTo(e2);
	}
	
	
	
}
