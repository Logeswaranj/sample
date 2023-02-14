package com.basic_java;

public class If_Else_If_Statement {
	static int person_Age= 70;

	public static void main(String[] args) {
		
		if (person_Age<=18) {
			System.out.println("This person is Children");
			
		} else if (person_Age>18&person_Age<=50) {
			System.out.println("This person is Teenager");
			
		} else if (person_Age>50) {
			System.out.println("This Person is senior citizen");
			
		}
	}
}
