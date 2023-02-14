package com.basic_java;

public class Methode_Overriding_Child extends Method_Overriding_Parent {
	//method overriding = class names are different but method name and arguments or parameters are same 
    // super is a keyword it is an parent class representation 
	@Override
	public void two_Numbers(int a, int b) {
		// TODO Auto-generated method stub
		super.two_Numbers(a, b);
	}
	@Override
	public void two_Numbers(double a, double b) {
		// TODO Auto-generated method stub
		super.two_Numbers(a, b);
	}
	@Override
	public void two_Numbers(float a, float b) {
		// TODO Auto-generated method stub
		super.two_Numbers(a, b);
	}
	@Override
	public void two_Numbers(long a) {
		// TODO Auto-generated method stub
		super.two_Numbers(a);
	}
	
	public static void main(String[] args) {
		Methode_Overriding_Child list = new Methode_Overriding_Child();
		list.two_Numbers(987654321l);
		list.two_Numbers(12346, 234);
		list.two_Numbers(33.33f, 66.66f);
		list.two_Numbers(123456789.123456789d, 0987654321.0987654321d);
		
	}
}
