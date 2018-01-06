package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		/*List<String> list =new ArrayList<String>();
		Optional<String> opt = list.stream().findAny();
		System.out.println(opt);*/
		
		String str=null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt);
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("empty");
	}

}
