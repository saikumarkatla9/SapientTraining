package com.sapient.computers;

import com.sapient.processors.IProcessor;

public class Desktop extends AbsComputer implements Computer{

	
	@Override
	public void start() {
		processor.process();
		
	}

}
