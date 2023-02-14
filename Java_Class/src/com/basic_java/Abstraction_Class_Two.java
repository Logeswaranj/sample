package com.basic_java;

public abstract class Abstraction_Class_Two extends Abstraction_Class_one {
	
	@Override
	public void friends() {
				super.friends();
	}

	@Override
	void no_1() {
				super.no_1();
	}
	public static void main(String[] args) {
		Abstraction_Class_one a = new Abstraction_Class_one(){};
		a.no_1();
		a.friends();
	}
}
