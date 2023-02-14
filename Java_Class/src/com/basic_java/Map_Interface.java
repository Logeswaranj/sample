package com.basic_java;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Interface {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> data = new TreeMap<>();
		data.put(33, "logan");
		data.put(44, "susi");
		data.put(66, "prabhu");
		
		System.out.println(data.size());
		System.out.println(data);
		System.out.println(data.get(66));
		System.out.println(data.keySet());
		System.out.println(data.values());
		System.out.println(data.containsKey(22));
		System.out.println(data.containsValue("susi"));
		Set<Entry<Integer, String>> entrySet = data.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
	}

}
