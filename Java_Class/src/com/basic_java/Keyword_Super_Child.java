package com.basic_java;

public class Keyword_Super_Child extends Keyword_Super_Parent{
	private void dataone() {
		System.out.println("superone");
	}
	@Override
	public void data() {
		// TODO Auto-generated method stub
		super.data();
	}
	public static void main(String[] args) {
		Keyword_Super_Child data = new Keyword_Super_Child();
		data.dataone();
		data.data();

	}
	
}
