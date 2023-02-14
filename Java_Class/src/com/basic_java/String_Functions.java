package com.basic_java;

public class String_Functions {
	
	public static void main(String[] args) {
		
		String string_One="i am a tester";
		String string_Two="i am a dev";
		
		int length = string_One.length();
		System.out.println(length);
		
		boolean equals = string_One.equals(string_Two);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = string_One.equalsIgnoreCase(string_Two);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = string_One.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = string_One.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = string_One.startsWith("i am ");
		System.out.println(startsWith);
		
		boolean endsWith = string_One.endsWith("er");
		System.out.println(endsWith);
		
		boolean contains = string_One.contains("am");
		System.out.println(contains);
		
		int indexOf = string_Two.indexOf("d");
		System.out.println(indexOf);
		
		int lastIndexOf = string_One.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		char charAt = string_Two.charAt(7);
		System.out.println(charAt);
		
		String replace = string_One.replace("tester", "dev");
		System.out.println(replace);
		
		String substring = string_One.substring(7, 13);
		System.out.println(substring);
		
		String substring2 = string_Two.substring(7);
		System.out.println(substring2);
		
		boolean empty = string_One.isEmpty();
		System.out.println(empty);
		
		String[] split = string_One.split("a");
		for (String string : split) {
			System.out.println(string);
		}
		
		
		String trim = string_One.trim();
		System.out.println(trim);
		
		String concat = string_One.concat(string_Two);
		System.out.println(concat);
		
		int compareTo = string_One.compareTo(string_Two);
		System.out.println(compareTo);
	}
	

}
