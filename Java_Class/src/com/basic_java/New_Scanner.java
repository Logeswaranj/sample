package com.basic_java;
import   java.util.Scanner;
public class New_Scanner {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Card Inserted");
		System.out.println("Enter the PIN Number");
		int nextInt = d.nextInt();
		System.out.println(nextInt + " PIN Confirmed ");
	
		System.out.println("Enter the amount");
		int nextInt2 = d.nextInt();
		System.out.println(nextInt2 + " is debited from Account ");
		
	  
		
	}

}
