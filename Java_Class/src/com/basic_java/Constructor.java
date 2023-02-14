package com.basic_java;

public class Constructor {
	
	public Constructor() {//Default constructor 
		System.out.println("Student Mark List");
			}
	Constructor(String a, int b,int c , int d){
		String student_Name = a;
		int mark_1 = b;
		int mark_2= c ;
		int mark_3=d;
		System.out.println("1 . "+  student_Name +" Physics -"+ mark_1 +"," +"Chemistry -"+ mark_2 +","+"Maths -" + mark_3  );
		
	}
	public static void main(String[] args) {
		Constructor first_List = new Constructor();
		Constructor Second_List = new Constructor("Logan - ",50 ,80 ,98);
	}

}
