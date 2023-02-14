package com.basic_java;

public class Armstrong_Number {
	public static void main(String[] args) {
		
		//1252 = 1 power 3 +2 power 3 + 5 power 3 =125
		
		int a,b = 0,c;
		int n=9474;
		while (n>0) {
			a=n%10;
			b=b+(a*a*a*a);
			n=n/10;
			
			
		}
		
		System.out.println(b);
	}

}
