package com.sapient.service;

public class Emp implements Cloneable{

		private int eid;
		private String ename;
		public Emp(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}
		@Override
		public String toString() {
			
			return eid+" "+ename;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Emp emp = (Emp)obj;
			if(this == emp)
				return true;
			else if(this.eid==emp.eid && this.ename==emp.ename)
				return true;
			else
				return false;
		}
		@Override
		protected void finalize() throws Throwable {
			/*// TODO Auto-generated method stub
			super.finalize();*/
			System.out.println("The object is GCed for employye Id "+eid);
		}
		@Override
		public Emp clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return (Emp)super.clone();
		}
		
		
		
}
