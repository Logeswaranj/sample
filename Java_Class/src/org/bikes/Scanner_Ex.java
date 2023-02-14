package org.bikes;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) {
		
		Scanner ex = new Scanner(System.in);
		
		System.out.println("Enter Student Name ");
		String next = ex.next();
		System.out.println(next+"-Student Name Verified");
		System.out.println("Enter Roll No ");
		 int nextInt = ex.nextInt();
		System.out.println(nextInt +"- Roll No confirmed");
		System.out.println("Enter Subject Name");
		String next2 = ex.next();
		System.out.println("Pass");
		
		
		
		
	}

}
