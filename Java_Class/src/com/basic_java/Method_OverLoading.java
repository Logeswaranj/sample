package com.basic_java;

public class Method_OverLoading {
	
	public void student_Details(String a) {
		String name = a;
		System.out.println("Name ="+name);
		
	}
	public void student_Details(long a)
	{
		long phone = a;
		System.out.println("Phone no ="+ phone);
	}
	
	public void student_Details(int a,int b, int c,int d, int e,int f) {
		int sum_Of_All_Subject = a+b+c+d+e+f;
		System.out.println("Total Marks ="+ sum_Of_All_Subject);
		
		
	}
	public static void main(String[] args) {
		Method_OverLoading details = new Method_OverLoading();
		details.student_Details("Loges");
		details.student_Details(1234567890l);
		details.student_Details(98, 99, 95, 93, 99, 91);
	}

	
}
