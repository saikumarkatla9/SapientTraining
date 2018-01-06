package com.sapient.computers;

public class Laptop extends AbsComputer implements Computer{

	@Override
	public void start() {
		processor.process();
		
	}

}
