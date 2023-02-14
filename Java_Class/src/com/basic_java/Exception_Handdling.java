package com.basic_java;

import java.util.InputMismatchException;

public class Exception_Handdling {
	static int a= 10;
	public static void arithmetic_Exception() {
		try {
			System.out.println(a/0);
		} catch (Exception e) {
						e.printStackTrace();
		}

		finally {
			System.out.println("Finally is done");
		}
		
	}
	public static void main(String[] args) {
		arithmetic_Exception();
		System.out.println("done");
		
		throw new  InputMismatchException("Exception on 23rd line");
		
	}

}
