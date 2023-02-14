package com.basic_java;



public class Fibonoci_Series {
	//0+1=1, 1+1=2, 1+2=3, 2+3=5
	//1,2,3,5,8...
	
	public static void main(String[] args) {
		int a = 0,b = 1,c;
		for (int i = 0; i < 10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
