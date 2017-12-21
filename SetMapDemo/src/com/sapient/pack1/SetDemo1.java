package com.sapient.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>(32,0.5f);
		set.add("sachin");
		set.add("dravid");
		set.add("ganguly");
		set.add("laxman");
		set.add("yuvi");
		set.add("yuvi"); //duplicates are ignored in set
		for(String str:set){
			System.out.println(str);
		}

	}

}
