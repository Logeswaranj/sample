package com.basic_java;


public class Data_Types {

	byte a = 10, A;
	short b = 200;
	int c = 9636566;
	long d = 73458291201l;
	float e = 10.10f;
	double f = 5555555.666666d;
	char g = 'A';
	boolean h = true;

	public void addition() {
		System.out.println(a + b);
		System.out.println(e + f);
System.out.println("A=" +( a+b));
	}

	public void subtraction() {
		System.out.println(b - c);
		System.out.println(e - f);

	}

	public void multiplication() {
		System.out.println(a * b);
		System.out.println(g);

	}

	
	public void division() {
		System.out.println(c % d);
		System.out.println(h);
	}

	public static void main(String[] args) {
		Data_Types function = new Data_Types();
		function.addition();
		function.subtraction();
		function.multiplication();
		function.division();
	}

}
