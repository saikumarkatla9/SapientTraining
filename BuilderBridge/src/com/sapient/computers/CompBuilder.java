package com.sapient.computers;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Processor;

import com.sapient.processors.I3;
import com.sapient.processors.I5;
import com.sapient.processors.IProcessor;

/*
Builder pattern assembling object based on the client request.

*/
public class CompBuilder {

	private static Map<String,Computer> cmap = new HashMap<>();
	private static Map<String,IProcessor> pmap = new HashMap<>();
	static{
		pmap.put("i3", new I3());
		pmap.put("i5", new I5());
		cmap.put("laptop", new Laptop());
		cmap.put("desktop", new Desktop());
	}
	public static Computer getComputer(String compType,String pcs) throws Exception{
		Computer comp = null;
		if(!cmap.containsKey(compType) || !pmap.containsKey(pcs))
			throw new Exception("invalid configuration");
		comp = cmap.get(compType);
		comp.setProcessor(pmap.get(pcs));
		return comp;
	}
}
