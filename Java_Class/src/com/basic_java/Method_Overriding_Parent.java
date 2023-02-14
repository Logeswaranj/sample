package com.basic_java;



public class Method_Overriding_Parent {
	/*same class the method name will be same but arguments or parameters will different*/
	public void two_Numbers(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of two numers are ="+ sum );
		
		
	}
	public void two_Numbers(double a,double b) {
		 double sum_1 = a+b; 
		System.out.println("Sum of two double numbers are ="+sum_1);
		
	}
	
	public void two_Numbers(long a) {
		long number = a;
		System.out.println("phone no is "+number);		
	}
	public void two_Numbers(float a , float b) {
		float sub = a-b;
		
		System.out.println("Subtraction of two numbers "+sub );
	}

	
		
	}

