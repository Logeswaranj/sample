package com.basic_java;

public class Keyword_Static {
	/*static keyword can be used in method level and variable level 
	 * we cannot give static in class level
	 *once we declare the method as a static and variable as a static without using the object 
	we can call the static method and static variable.
	*/
	static int a = 124;
	
	public static void parant() {
		System.out.println("parant");
		System.out.println(a);
	}
	public static void main(String[] args) {
		parant();
	}

}
