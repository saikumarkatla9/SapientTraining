package com.sapient.valueobject;

import java.time.LocalDate;

public class Emp implements Comparable<Emp>{

	private int eid;
	private String ename;
	private double sal;
	private int did;
	private LocalDate doj;
	
	
	
	public void setSal(double sal) {
		this.sal = sal;
	}



	public Emp(int eid, String ename, double sal, int did, LocalDate doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.did = did;
		this.doj = doj;
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

	public int getDid() {
		return did;
	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		
		return eid+" "+ename+" "+sal+" "+did+" "+doj;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.eid;
		Integer e2 = emp.eid;
		return e1.compareTo(e2);
	}
		
}
