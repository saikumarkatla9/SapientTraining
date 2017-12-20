package com.sapient.service;

public class Bank implements Atm,Agent{

	
	private static Bank bank = new Bank();
	
	private Bank(){
		
	}
	public static Atm getAtm(){
		Atm atm=bank;
		return atm;
	}
	
	public static Agent getAgent(){
		Agent agent=bank;
		return agent;
	}
	@Override
	public void clearPdc() {
		// TODO Auto-generated method stub
		System.out.println("clear pdc");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("approve loan");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit");
	}

	@Override
	public void getBal() {
		// TODO Auto-generated method stub
		System.out.println("get balance");
	}

}
