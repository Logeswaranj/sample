package com.basic_java;

public class Nested_If_Statement {
   static int age =14;
   static int weight=40;
   
   
	public static void main(String[] args) {
		if (age>=18) 
			if (weight>40)
				{
			System.out.println(" Elegible To Donate Blood");
		 	
			}else
		{
			System.out.println("Not Eligible");
		}
		else {
			System.out.println("Age Must Be Greater Than 18");
		}
		
	}
}
