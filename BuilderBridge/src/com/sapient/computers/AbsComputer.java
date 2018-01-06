package com.sapient.computers;

import com.sapient.processors.IProcessor;

public class AbsComputer {

	protected IProcessor processor;

	public AbsComputer() {
		super();
	}

	public void setProcessor(IProcessor processor) {
		this.processor = processor;
	}

}