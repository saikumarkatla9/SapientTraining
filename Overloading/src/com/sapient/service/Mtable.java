package com.sapient.service;

public class Mtable {
	
	private int num;

	public Mtable(int num) throws Exception {
		super();
		if(num<=0)
			throw new Exception("number must be greater than zero");
		this.num = num;
	}
	
	public void display(){
		showTable(1,10);
	}
	
	public void display(int rows){
		showTable(1,rows);
	}
	
	public void display(int start,int end) throws Exception{
		if(start>0 && end>0 && end>=start)
			showTable(start,end);
		else
			throw new Exception("start and end must be postive and end should be greater than start");
	}
	
	private void showTable(int start,int end){
		for(int count=start;count<=end;count++){
			System.out.printf("%d * %d = %d\n",num,count,(num*count));
		}
	}
}
