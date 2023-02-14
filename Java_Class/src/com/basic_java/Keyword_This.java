package com.basic_java;

public class Keyword_This {
	//this keyword is an current class reference 
	
	public void schooltenth() {
		System.out.println("10th");
		this.schooltwelth();
		
	}
	public  void schooltwelth() {
		System.out.println("12th");
		this.college();
	}

	public void college() {
		System.out.println("clg");
		
	}
	public static void main(String[] args) {
		Keyword_This data = new Keyword_This();
		data.schooltenth();
	}
}
