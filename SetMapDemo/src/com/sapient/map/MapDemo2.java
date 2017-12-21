package com.sapient.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1005, "kohli");
		map.put(1004, "sunil");
		map.put(1005, "smith");//replaces smith with kohli
		map.put(1007, "root");
		map.put(1006, "devilliers");
		
		Set<Integer> set = map.keySet();
		for(Integer key:set){
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("iterating using values()");
		Collection<String> col =map.values();
		for(String str:col){
			System.out.println(str);
		}
		
		System.out.println("iterating using entrySet()");
		Set<Entry<Integer,String>> entries = map.entrySet();
		for(Entry e:entries){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
