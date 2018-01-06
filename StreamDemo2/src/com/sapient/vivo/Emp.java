package com.sapient.vivo;

public class Emp implements Comparable<Emp>{

	private int eid;
	private String name;
	private Double sal;
	public Emp(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.eid;
		Integer e2 = emp.eid;
		return e1.compareTo(e2);
	}


	

	


	
	
	
	
}
