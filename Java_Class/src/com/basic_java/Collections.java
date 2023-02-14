package com.basic_java;

import java.util.HashSet;

public class Collections {
	public static void main(String[] args) {
		HashSet<String>  data = new HashSet<String>();
		data.add("logan");
		data.add("gopi");
		data.add("prabhu");
		data.add("susi");
		data.add("rubesh");
		System.out.println(data);
		int size = data.size();
		System.out.println(size);
		boolean remove = data.remove("gopi");
		System.out.println(remove);
		boolean empty = data.isEmpty();
		System.out.println(empty);
		
		
		
		
		
		
		
	}
	
	

}
