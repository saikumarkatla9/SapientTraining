package com.sapient.service;

public class Interest {

		private double amt;
		private int years;		//instance variables
		private float rate;
		
		
		public double getAmt() {
			return amt;
		}

		public void setAmt(double amt) throws Exception {
			if(amt<5000)
				throw new Exception("Amount must be greater than 5000");
			this.amt = amt;
		}

		public int getYears() {
			return years;
		}

		public void setYears(int years) throws Exception {
			if(years<=0 || years>30)
				throw new Exception("number of years must be between 1 and 30");
			this.years = years;
		}

		public float getRate() {
			return rate;
		}

		public void setRate(float rate) throws Exception {
			if(rate<=0)
				throw new Exception("Interest must be greater than zero");
			this.rate = rate;
		}

		public double calcSimple(){
			double si = amt*years*rate/100;
			return si;
		}
		
		public double calcCompound(){
			double si = amt*Math.pow((1+rate/100),years);
			return si;
		}
		
		
}
